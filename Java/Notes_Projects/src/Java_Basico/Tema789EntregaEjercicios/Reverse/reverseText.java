package Java_Basico.Tema789EntregaEjercicios.Reverse;

import java.util.Scanner;

public class reverseText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.println( "Introduce una palabra" );
        String texto = scanner.nextLine();
        System.out.println( reverse( texto ) );

    }

    public static String reverse(String texto ) {

        char[] saveText = new char[ texto.length() ];
        String reverseText = "";

        for (int i = 0; i < texto.length(); i++) {
            saveText[i] = texto.charAt( i );
        }

        for (int i = texto.length() - 1; i >= 0 ; i--){
            reverseText += saveText[i];
        }

        return reverseText;
    }


}
