package com.example.restAndJPA.controllers;

import com.example.restAndJPA.entities.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT ) //To test spring beans
class BookControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort //Spring inyect the port in this variable
    private int port;

    @BeforeEach
    void setUp() {
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
        testRestTemplate = new TestRestTemplate( restTemplateBuilder );
    }

    @DisplayName("Comprobar Hola mundo desde controladores Spring Rest")
    @Test
    void helloWorld() { //This method  is from HelloController
        ResponseEntity<String> response = testRestTemplate.getForEntity("/hola", String.class); //This is HTTP Get,
        //into parentheses there are the url to make a GET request and the  response that is should be returned ( This is in the method from HelloController )
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello World dudes!!!", response.getBody());
    }

    @Test
    void findAll() {
        ResponseEntity<Book[]> response = testRestTemplate.getForEntity("/api/books", Book[].class);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        List<Book> books = Arrays.asList( response.getBody() ); //Transform Array to List
        assertEquals(0, books.size()); //
    }

    @Test
    void findById() {
        ResponseEntity<Book> response = testRestTemplate.getForEntity("/api/books/1", Book.class);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

    }

    @Test
    void create() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON); //This means that we will send a JSON
        headers.setAccept(Arrays.asList( MediaType.APPLICATION_JSON )); //This means that we will accept JSON
        String json = """
                 {
                     "title": "Libro creado desde spring Test",
                     "author": "Miyamoto",
                     "pages": 100,
                     "price": 2400.0,
                     "releaseDate": "2021-01-09",
                     "hasOnline": false
                 }
                """;

        HttpEntity<String> request = new HttpEntity<>(json,headers);
        ResponseEntity<Book> response = testRestTemplate.exchange("/api/books", HttpMethod.POST, request, Book.class);

        Book result = response.getBody();

        assertEquals( 1, result.getId() );
        assertEquals("Libro creado desde spring Test", result.getTitle());

    }
}