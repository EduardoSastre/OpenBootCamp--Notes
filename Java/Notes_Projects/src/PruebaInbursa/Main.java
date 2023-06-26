package PruebaInbursa;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int suma = 0;

        if ( x >= 1 && x <= 500 ){

            for ( int i = 0; i <= x  ; i++ ){

                suma += i;

            }

        }

        System.out.println( suma );

    }

}
