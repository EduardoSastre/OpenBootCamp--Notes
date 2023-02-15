package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Strategy;

import java.util.ArrayList;

public class Main {
      public static void main(String[] args) {

            UsuariosFichero usuarios = new UsuariosFichero();

            crear( usuarios,"Fulano1");
            crear( usuarios,"Fulano2");
            crear( usuarios,"Fulano3");

            for( String usuario : lista ( usuarios ) ){
                  System.out.println( usuario );
            }

            UsuariosMemoria usuarios1 = new UsuariosMemoria();

            crear( usuarios1,"Fulano4");
            crear( usuarios1,"Fulano5");
            crear( usuarios1,"Fulano6");

            for( String usuario : lista ( usuarios1 ) ){
                  System.out.println( usuario );
            }
      }

      public static void crear( Usuarios usuarios, String nombre ){
            usuarios.crear( nombre );
      }

      public static ArrayList<String> lista (Usuarios usuarios ){
            return usuarios.lista();
      }
}
