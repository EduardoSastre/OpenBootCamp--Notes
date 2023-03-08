package com.notesOB.springDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //This is a bean ( like @component annotation )
public interface CocheRepository extends JpaRepository<Coche, Long> {
    //Ctrl + click in JpaRepository, the interface shows that its needed a type and its primary key
    //Spring autommatically implements this interface
}
