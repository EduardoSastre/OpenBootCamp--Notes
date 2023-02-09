package Java_Avanzado.iterativo_VS_recursivo_VS_funcional;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Suma iterativa: " + suma_iterativa(5) );
        System.out.println( "Suma recursiva: " + suma_recursiva(5) );
        System.out.println( "Suma funcional: " + suma_funcional(5) );
    }

    public static int suma_iterativa( int numero ){
        int suma = 0;

        for( int i = 0; i <= numero; i++){
            suma += i;
        }

        return suma;
    }

    public static int suma_recursiva( int numero ){
        if ( numero == 1 ){
            return 1;
        }

        return numero + suma_recursiva( numero - 1 );
    }

    public static int suma_funcional( int numero ){
        return IntStream.rangeClosed(1,numero).
                reduce( 0, (x,y) -> x + y );
    }
}
