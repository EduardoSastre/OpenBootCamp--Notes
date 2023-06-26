package PruebaInbursa;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);


        String word = in.nextLine();
        word = word.trim().toLowerCase().replaceAll("\\s", "" );
        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverseWord += word.charAt( i );

        }

        if ( word.equals( reverseWord ) ){

            System.out.println( "SI" );

        } else {

            System.out.println( "NO" );

        }

    }

}
