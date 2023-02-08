package Java_Avanzado.Programación_funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pablo");

        /**
         * Java streams enable functional-style operations on streams of elements. A stream is an abstraction of a non-mutable
         * collection of functions applied in some order to the data. A stream is not a collection where you can store elements.*/

        nombres.stream().forEach( x -> System.out.println( x ) ); //Recorrer Arraylist con programación funcional
        //Del array list se crea un stream y luego se llama al metodo for each de ese stream


        Stream<String> valores = nombres.stream(). //Se crea un Objeto Stream del Arraylist nombres
                map( x -> x.toUpperCase() ). //map aplica una funcion lambda a cada item del stream
                filter( x -> x.startsWith("P") ); //Se aplica un filtro al stream que genero el metodo map

        valores.forEach( x -> System.out.println(x)); //Se "elimina" el stream al usar el metod for each, si se volviera a llamar marcaria error

        //Transformar Array a Stream

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        var streamNumeros = Arrays.stream(numeros); //Crea un Stream con los valores del Array ( Es una copia )

        /*
        .filter( ... ) : Dentro del stream solo se quedan los valores pares.
        .reduce( ... ) : Suma los valores anteriormente filtrados por .filter(). Reduce siempre regresa un solo dato.
        reduce es una forma de iteración, X adquiere el valor de identity ( inicialmente 0 ), Y toma el valor guardado en el stream filtrado.
        Al sumarse x + y el valor se guarda en identity, luego se repite el proceso nuevamente.
        */
        streamNumeros.filter(x -> x % 2 == 0).
                reduce( 0, ( x,y ) -> {
                    System.out.println("X es: " + x + ", Y es: " + y );
                    return x + y;
                });
    }
}
