package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    String message = "Mensaje original";

    @Autowired //In case there are multiple constructors, spring initializes this class with this constructor
    CalculatorService(){
        System.out.println("Constructor de calculator service");
    }

    public String holaMundo(){
        return "Hola mundo";
    }

    public String defaultMessage(){
        return message;
    }

}
