package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String helloWorld(){
        return "Hello World desde spring security!!!";
    }

    @GetMapping("/notes")
    public String notes(){
        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Notas Spring</title>
                </head>
                <body>
                    <h1>Spring framework </h1>
                                
                    <h2>Dependencies</h2>
                    <img src="images/pomxml.png" alt="pomxml">
                    <p>We add the dependencies from <a href="https://mvnrepository.com" >Maven</a> then when we actualize the maven
                        project these dependencies autodownload in "Externals libraries.
                    </p>
                                
                    <h2>Containers</h2>
                    <img src="images/beans.png" alt="beans">
                    <p>Into "resources" in the file "beans.xml" we add the classes that spring will handle. The objects from that classes are unique.</p>
                    <img src="images/javaVsSpring.png" alt="Java vs Spring">
                                
                    <h2>Spring Initializer</h2>
                    <img src="images/springInitializer.png" alt="spring Initializer">
                                
                    <h2>Repositories</h2>
                    <p>This class is for DB connection</p>
                    <img src="images/springDB.png" alt="spring Repositories">
                                
                    <h2>REST</h2>
                    <p>This class will receive http request</p>
                    <img src="images/springRest.png" alt="springRest">
                    <p>@RestController is for Restful, @Controller is for spring MVC </p>
                </body>
                </html>
                """;
    }

}
