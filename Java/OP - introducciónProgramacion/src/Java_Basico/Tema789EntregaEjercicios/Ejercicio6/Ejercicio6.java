package Java_Basico.Tema789EntregaEjercicios.Ejercicio6;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        /* First way
        for (int i = 1; i <= 10; i++) {
            list.add( i );
        }

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) % 2 == 0 ) {
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i) + " " );
        }
        */

        // Second way
        for (int i = 1; i <= 10; i++) {
            if ( i % 2 == 0 )
                continue;
            list.add( i );
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i) + " " );
        }

    }
}
