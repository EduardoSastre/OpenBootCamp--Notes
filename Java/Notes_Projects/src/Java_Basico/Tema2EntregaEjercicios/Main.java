package Java_Basico.Tema2EntregaEjercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        precioConIva( precio );

    }

    public static void precioConIva( double precio ){
        double iva = 0.16;
        System.out.println( "El precio con iva es: " + (  precio + ( precio * iva )  ) );
    }
}
