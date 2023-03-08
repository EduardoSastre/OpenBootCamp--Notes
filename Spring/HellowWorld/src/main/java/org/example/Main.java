package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //Concept 1 -- Obtain beans
                //Beans.xml was created in resources
                ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //Spring container
//
                //With this we obtain the class calculator service that was previously registered in beans.xml
                CalculatorService calculator = (CalculatorService) context.getBean( "calculatorService" );
//                CalculatorService calculator2 = (CalculatorService) context.getBean( "CalculatorService" );

                //System.out.println( calculator.holaMundo() );
                //System.out.println( calculator2.holaMundo() );

                //IMPORTANT: CalculatorService only creates once like the behaviour of singleton pattern, always called the same object

        //Concept 2 -- Charge Bean into another bean ( Charge CalculatorService bean and AnotherClass bean )

                //CalculatorService calculator = (CalculatorService) context.getBean( "CalculatorService" );
                //calculator.message = "Mensaje cambiado";

                AnotherClass anotherClass = (AnotherClass) context.getBean( "anotherClass");
                System.out.println( anotherClass.calculator.defaultMessage() );

        //Concept 3 -- Scope
        /*The default scope for beans is singleton, when the bean is called, always is injecting same object
        In the other hand, if scope is switch to prototype, a new object is created and injected when the bean is called
        This can be verified by putting the scope prototype in the bean Calculator service ( into beans.xml ) and
        watching the multiple messages from the constructor of the class Calculator Service
        * */


    }
}