package com.example.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void variablesDeEntorno(){ //To check variables de entorno
		System.getenv().forEach(
				( key, value ) -> System.out.println( key + " " + value )
		);
	}

}
