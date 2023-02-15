package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios{
      private String ficheroUsuarios = "usuarios.txt";
      private PrintStream fichero;

      public UsuariosFichero() {
            try{
                  fichero = new PrintStream( ficheroUsuarios );
            } catch (Exception e){
                  System.out.println( "No puedo abrir el archivo: " + e.getMessage() );
            }
      }

      @Override
      public void crear(String usuario){
            fichero.println( usuario ); //Save user in the file
      }

      @Override
      public ArrayList<String> lista(){
            ArrayList<String> usuarios = new ArrayList<String>();

            try{
                  Scanner scanner = new Scanner( new File( ficheroUsuarios ) );

                  while ( scanner.hasNext()){
                        usuarios.add( scanner.next() );
                  }

                  scanner.close();

            } catch (Exception e){
                  System.out.println("Error leyendo: " + e.getMessage() );
            }

            return usuarios;
      }
}
