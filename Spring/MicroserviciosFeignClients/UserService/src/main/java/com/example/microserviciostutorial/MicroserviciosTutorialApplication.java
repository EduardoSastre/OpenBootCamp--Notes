package com.example.microserviciostutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroserviciosTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosTutorialApplication.class, args);



	}

}
