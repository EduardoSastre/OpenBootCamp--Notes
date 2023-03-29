package com.example.springsecuritycifrado;

import com.example.springsecuritycifrado.Entities.User;
import com.example.springsecuritycifrado.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityCifradoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringSecurityCifradoApplication.class, args);
        UserRepository repository = context.getBean( UserRepository.class );
        PasswordEncoder encoder = context.getBean( PasswordEncoder.class );;

        User user = new User( null, "ElonMusk", encoder.encode("123") );
        repository.save( user );
    }


}
