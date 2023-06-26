package PruebaInbursa;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int multiplicacion = 1;

        if ( x <= 15 ){

            for ( int i = 1; i <= x  ; i++ ){

                multiplicacion *= i;

            }

        }

        System.out.println( multiplicacion );

    }

}
