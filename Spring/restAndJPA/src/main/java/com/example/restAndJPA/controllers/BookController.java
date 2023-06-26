package com.example.restAndJPA.controllers;

import com.example.restAndJPA.entities.Book;
import com.example.restAndJPA.repositories.BookRepository;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController //This class will receive http request
public class BookController {

    private BookRepository repository;
    private final Logger log = LoggerFactory.getLogger( BookController.class );
    //This is to create logs

    BookController( BookRepository repository ){
        this.repository = repository;
    }
    //CRUD of book

    //Find all books
    @GetMapping("/api/books")
    public List<Book> findAll() {
        return repository.findAll(); //Automatically With Jackson library this is transformed to JSON
    }

    //Find a book

    @GetMapping("/api/books/{id}") //{id} is a parameter ( variable )
    @Operation(description = "Get a book")
    public ResponseEntity<Book> findById(@Parameter(ref = "Primary Key type Long") @PathVariable Long id ){ //@PathVariable vinculates {id} from line above with Long id
        //ResponseEntity<Object> is a http response
        Optional<Book> bookFinded = repository.findById(id);

        if ( bookFinded.isPresent() ){
            return ResponseEntity.ok( bookFinded.get() );
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Create a book
    @PostMapping( "/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers ){ //Book is from Front end
        System.out.println( headers ); //This is information about the browser

        if ( book.getId() != null ){ //If the book has and ID that means the book already exist in db ( Trying to update )
            log.warn("Trying to create a book with an ID");
            return ResponseEntity.badRequest().build();
        }

        Book bookSaved = repository.save(book);
        return ResponseEntity.ok( bookSaved ); //.create() to redirect user to new page


    }

    //Update a book
    @PutMapping("/api/books")
    public ResponseEntity<Book> update( @RequestBody Book book ){

        if ( book.getId() == null ){ //if book doesn't have an Id that means the book doesn't exist in DB ( Trying to create )
            log.warn("Trying update a book that doesn't exist");
            return ResponseEntity.badRequest().build();
        }

        if ( !repository.existsById(book.getId() ) ){ //Check if the book exist in DB
            log.warn("Trying update a book that doesn't exist");
            return ResponseEntity.notFound().build();
        }

        Book bookSaved = repository.save(book);
        return ResponseEntity.ok( bookSaved ); //.create() to redirect user to new page

    }


    @DeleteMapping("/api/books/{id}")
    @Hidden //No show this in documentation
    public ResponseEntity<Book> delete( @PathVariable Long id ){
        if ( !repository.existsById(id) ) {
            log.warn("Trying to delete a non exist book");
            return ResponseEntity.notFound().build();
        }

        //For databases with a lot of relations between tables, it's ideal use try Catch statement

        repository.deleteById(id);
        return ResponseEntity.noContent().build(); //This sends response 200
    }


    @DeleteMapping("api/books")
    public ResponseEntity<Book> deleteAll(){
        log.info("REST request for delete all books");
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }



}
