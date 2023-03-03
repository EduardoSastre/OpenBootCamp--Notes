package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnotherClass {

    CalculatorService calculator;
    String name;

    @Autowired //In case there are multiple constructors, spring initializes this class with this constructor
    AnotherClass( CalculatorService calculator, @Value("${name.someText}")String name ) {
        System.out.println("Constructor AnotherClass");
        this.calculator = calculator;
        this.name = name;

    }

}
