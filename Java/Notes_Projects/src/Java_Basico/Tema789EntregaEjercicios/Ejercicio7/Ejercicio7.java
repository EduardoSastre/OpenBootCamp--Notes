package Java_Basico.Tema789EntregaEjercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        int numero = scanner.nextInt();
        System.out.println("Escribe otro numero entero: ");
        int otroNumero = scanner.nextInt();

        try {
            int division = DividePorCero( numero, otroNumero );
            System.out.println( "DemoCodigo" );
        } catch (ArithmeticException e) {
            System.out.println( "Esto no puede hacerse" );
        }

    }

    public static int DividePorCero( int num1, int num2 ) throws  ArithmeticException{
            return num1/num2;
    }
}
