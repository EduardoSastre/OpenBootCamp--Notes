package Java_Basico.Input_Output.CrearFicheros;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner( System.in ); //in es un InputStream

            System.out.println("Escribe un numero: ");
            int numero = scanner.nextInt();

            //out es un printStream
            System.out.println( "Tu numero es: " + numero );

            //Genera un archivo con el nombre especificado en la ruta especificada
            PrintStream info = new PrintStream("C:\\Users\\knoxs\\IdeaProjects\\OP - introducciónProgramacion\\src\\Java_Basico\\Input_Output\\CrearFicheros\\ArchivoNuevo.txt");
            info.println( "Hola :)" ); //Escribe esto dentro del archivo generado

            //Leer un fichero y luego crear otro con otro nombre

            try {
                InputStream information = new FileInputStream( "C:\\Users\\knoxs\\IdeaProjects\\OP - introducciónProgramacion\\src\\Java_Basico\\Input_Output\\LeerFicheros\\fichero.txt" );
                byte[] data = information.readAllBytes();
                information.close(); //Siempre cerrar ficheros --- El sistema operativo puede tener abiertos ficheros limitados

                PrintStream saveInfo = new PrintStream( "C:\\Users\\knoxs\\IdeaProjects\\OP - introducciónProgramacion\\src\\Java_Basico\\Input_Output\\CrearFicheros\\copiaFichero.txt" );
                saveInfo.write( data );
                saveInfo.close(); //Siempre cerrar ficheros --- El sistema operativo puede tener abiertos ficheros limitados
            } catch (Exception e) {
                System.out.println("Mensaje: " + e.getMessage());
            }


        }
        catch ( Exception e) {
            System.out.println("Mensaje: " + e.getMessage());
        }

    }
}
