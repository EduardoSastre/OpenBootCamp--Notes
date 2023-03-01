package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //Beans.xml was created in resources
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //With this we obtain the class calculator service that was previously registered in beans.xml
        calculatorService calculator = ( calculatorService ) context.getBean( "calculatorService" );
        calculatorService calculator2 = ( calculatorService ) context.getBean( "calculatorService" );

        System.out.println( calculator.holaMundo() );
        System.out.println( calculator2.holaMundo() );

        //IMPORTANT: CalculatorService only creates once like the behaviour of singleton pattern, always called the same object

    }
}