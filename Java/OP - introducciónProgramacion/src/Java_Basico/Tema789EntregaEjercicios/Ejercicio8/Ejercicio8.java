package Java_Basico.Tema789EntregaEjercicios.Ejercicio8;

import java.io.*;

public class Ejercicio8 {
//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut"
//La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

    public static void main(String[] args) {
        try {
            String path = "src/Java_Basico/Tema789EntregaEjercicios/Ejercicio8/Archivo.txt";
            PrintStream fileGenerated = new PrintStream( path );
            fileGenerated.print("Hola soy un archivo con cosas bien complejas :)");

            InputStream fileIn = new FileInputStream( path );
            byte[] data = fileIn.readAllBytes();
            fileIn.close();

            PrintStream fileOut = new PrintStream( "src/Java_Basico/Tema789EntregaEjercicios/Ejercicio8/copiaArchivo.txt" );
            fileOut.write( data );


        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
