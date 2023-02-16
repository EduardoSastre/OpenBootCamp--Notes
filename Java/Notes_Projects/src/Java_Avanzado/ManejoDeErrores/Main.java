package Java_Avanzado.ManejoDeErrores;

import jdk.jfr.StackTrace;

public class Main {

       public static void main( String[] args ) {

              func1();

       }

       public static void func1(){
              func2();
       }

       public static void func2(){


              try{

                     int valor = 5 / 0;

              } catch( Exception e ){

                     System.out.println( "Esto es una división por cero" );

                     //Saber por donde ha pasado el programa

                     for ( StackTraceElement valor : e.getStackTrace() ){
                            System.out.println( "Linea: " + valor.getLineNumber() +  " " + valor.getMethodName() );
                     }

              }

       }

}
