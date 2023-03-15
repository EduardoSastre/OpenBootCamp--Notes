package com.example.restAndJPA.repositories;

import com.example.restAndJPA.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //This class if for DB connection
public interface BookRepository extends JpaRepository<Book,Long> { //Book is the Entity and Long is the primary key type
}
