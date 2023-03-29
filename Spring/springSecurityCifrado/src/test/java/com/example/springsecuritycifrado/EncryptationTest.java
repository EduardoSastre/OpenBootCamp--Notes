package com.example.springsecuritycifrado;


import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.security.crypto.password.Pbkdf2PasswordEncoder.SecretKeyFactoryAlgorithm.PBKDF2WithHmacSHA256;

public class EncryptationTest {

    /**
     * Bcrypt generates his proper salt of 16 bytes ( This salt is added to the password hashed )
     *
     * The result of bcrypt is a string of 60 characters
     *
     * Parameters of the bcrypt algorithm:
     * $a - version
     * $10 - power of password ( It can be between 4 and 31, default 10 ) --- More power means less server performance ( times for access data rise up )
     *The next 22 characters are the salt generated
     * */
    @Test
    void bcryptTest(){

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashPassword = passwordEncoder.encode( "12345" );
        System.out.println( hashPassword ); //The password hashed + salt

        //Although we create 10 times the same password, into DB are 10 differents passwords because a random salt is added to each one
        //With this if a password is infringed, the another 9 are safe.

        for ( int i = 0; i < 10; i++ ){

            hashPassword = passwordEncoder.encode( "12345" );
            System.out.println( hashPassword );

        }

        //Example: user logged in --- Check if a password matches with password in DB
        boolean matches = passwordEncoder.matches( "12345", hashPassword );
        System.out.println( matches ); //Check if the password that user put is the same saved in DB

    }

    @Test
    void pbkdf2(){

        Pbkdf2PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder("hello", 16, 31000, PBKDF2WithHmacSHA256);
        String hashPassword = passwordEncoder.encode( "12345" );
        System.out.println( hashPassword ); //The password hashed + salt


    }


    @Test
    void SprignPasswordEncoders(){

        //In case that a migration is needed and the encoders should be switched, this is the best way to implement encoders, with this only few
        //lines of code need change, in comparison, if encoders are implemented directly that means that a lot of lines of code need to be changed.

        Map<String, PasswordEncoder> encoders = new HashMap<>();
        encoders.put( "bcrypt", new BCryptPasswordEncoder() );
        encoders.put( "pbkdf2", new Pbkdf2PasswordEncoder("hello", 16, 31000, PBKDF2WithHmacSHA256) );
        encoders.put( "argon2", new Argon2PasswordEncoder(16, 32, 1, 1 << 12, 3) );
        encoders.put( "scrypt", new SCryptPasswordEncoder(65536, 8, 1, 32, 16) );

        PasswordEncoder passwordEncoder = new DelegatingPasswordEncoder( "bcrypt", encoders );

        //Using the first example "EncryptationTest" above but using DeletePasswordEncoder
        String hashPassword = passwordEncoder.encode( "12345" );
        System.out.println( hashPassword );

    }


}
