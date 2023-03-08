package com.notesOB.springDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println( "El numero de coches en la base de datos es: " + repository.count() );

		//Create and store a Coche
		Coche coche = new Coche( null, "Nissan", "z", 2023 );
		repository.save( coche );

		System.out.println( "El numero de coches en la base de datos es: " + repository.count() );

		//Get the Coches stored in the repository
		System.out.println( repository.findAll() );


	}

}
