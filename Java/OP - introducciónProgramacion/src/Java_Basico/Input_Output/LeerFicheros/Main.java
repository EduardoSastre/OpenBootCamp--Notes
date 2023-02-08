package Java_Basico.Input_Output.LeerFicheros;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try { //-------------------------------------------Usando InputStream directamente -------------------------------------------

            //El contenido de fichero.txt se guarda en el objeto fichero en forma de bytes
            InputStream fichero = new FileInputStream( "C:\\Users\\knoxs\\IdeaProjects\\OP - introducciónProgramacion\\src\\Java_Basico\\Input_Output\\fichero.txt" );

            leerFicheroCompleto(fichero); //Lee completamente el fichero.txt -- esto trae el problema de uso de mas memoria
            leerFicheroDatoPorDato(fichero); //Lee byte por byte el fichero.txt -- esto trae el problema de mas operaciones sobre el disco duro
            leerFicheroVariosDatos(fichero, 10); //Parecido a leer dato por dato pero en lugar de ser uno por uno, son varios por varios ( de 10 en 10 en este ejemplo )

        } catch ( FileNotFoundException e) {
            System.out.println("Mensaje: " + e.getMessage());
        }

        try { //-------------------------------------------Usando InputStream indirectamente, Usando BufferInputStream-------------------------------------------

            //El contenido de fichero.txt se guarda en el objeto fichero en forma de bytes
            InputStream fichero = new FileInputStream( "C:\\Users\\knoxs\\IdeaProjects\\OP - introducciónProgramacion\\src\\Java_Basico\\Input_Output\\fichero.txt" );
            BufferedInputStream ficheroBuffer = new BufferedInputStream( fichero ); //Al igual que leer varios datos por varios datos, el buffer se encarga de escoger los bytes
            //Buffered --- Esta memoria es dinamica se llena y vacia sola
            leerFicheroDatoPorDato( ficheroBuffer );

        } catch ( FileNotFoundException e) {
            System.out.println("Mensaje: " + e.getMessage());
        }

    }

    public static void leerFicheroCompleto( InputStream fichero ){
        try {
            //Se crea un array que contenga los bytes del objeto fichero
            byte[] ficheroDatos = fichero.readAllBytes();

            System.out.println("Aqui es con todos los datos");

            //Se muestran los bytes del array
            for( byte dato : ficheroDatos ){
                System.out.print(dato);
            }
            System.out.println();
            //Se muestran los bytes del array y se transforman a tipo character
            for( byte dato : ficheroDatos ){
                System.out.print( (char)dato);
            }
        } catch (IOException e) {
            System.out.println( "No se leyo el fichero" + e.getMessage() );
        }
    }

    public static void leerFicheroDatoPorDato( InputStream fichero ){
        try {
            //El metodo read devuelve int, por lo tanto el dato que lo guarde tambien debe ser int
            int dato = fichero.read();

            while( dato!= -1 ){
                System.out.print((char)dato);
                dato = fichero.read();
            }
        } catch (IOException e) {
            System.out.println( "No se leyo el fichero" + e.getMessage() );
        }
    }
    public static void leerFicheroDatoPorDato( BufferedInputStream fichero ){
        try {
            //El metodo read devuelve int, por lo tanto el dato que lo guarde tambien debe ser int
            int dato = fichero.read();

            System.out.println();

            while( dato!= -1 ){
                System.out.print((char)dato);
                dato = fichero.read();
            }
        } catch (IOException e) {
            System.out.println( "No se leyo el fichero" + e.getMessage() );
        }
    }

    public static void leerFicheroVariosDatos( InputStream fichero, int numBytes ){
        try {
            byte[] datos = new byte[ numBytes ];
            int dato = fichero.read( datos );

            while( dato!= -1 ){
                System.out.println("Esto es dato por dato");
                System.out.print((char)dato);
                dato = fichero.read();
            }
        } catch (IOException e) {
            System.out.println( "No se leyo el fichero" + e.getMessage() );
        }
    }
}
