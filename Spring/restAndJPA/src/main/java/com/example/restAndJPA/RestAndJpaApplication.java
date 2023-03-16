package com.example.restAndJPA;

import com.example.restAndJPA.controllers.BookController;
import com.example.restAndJPA.entities.Book;
import com.example.restAndJPA.repositories.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import java.time.LocalDate;
import java.util.Optional;

@EnableWebMvc
@SpringBootApplication
public class RestAndJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RestAndJpaApplication.class, args);
		BookRepository repository = ( BookRepository ) context.getBean("bookRepository");

		//For learning purposes this is in main but the correct position of a CRUD is in a class Service/Controller
		//BookController bookController = ( BookController ) context.getBean("bookController");

		//Create book
		Book book = new Book( null, "Can I say", "Travis Barker", 300, 600.00, LocalDate.of(2017, 02, 22), true );
		repository.save(book);
		System.out.println("Book created");

		//Read book
		Book searchedBook = new Book();
		searchedBook.setTitle("Can I say");
		Example<Book> bookExample = Example.of( searchedBook );
		System.out.println( "(Read) Find a book: " + repository.findOne( bookExample ) );

		//Update book
		Optional<Book> bookDB = repository.findOne( bookExample );
		Book bookFind = bookDB.get();
		bookFind.setTitle("Can I say: The revenge!");
		repository.save( bookFind );
		System.out.println( "(Update) All updated books are: " + repository.findAll() );

		//Delete book
		/*
		Book searchedBook2 = new Book();
		searchedBook2.setTitle("Can I say: The revenge!");
		Example<Book> bookExample2 = Example.of( searchedBook2 );
		Optional<Book> bookDB2 = repository.findOne( bookExample2 );
		Book bookFind2 = bookDB2.get();
		repository.deleteById( bookFind2.getId() );
		System.out.println( "(Delete) All books are: " + repository.findAll() );*/
	}

}
