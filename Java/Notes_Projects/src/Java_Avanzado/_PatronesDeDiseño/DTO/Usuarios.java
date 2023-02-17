package Java_Avanzado._PatronesDeDiseño.DTO;

import java.util.ArrayList;

public class Usuarios {

       ArrayList< Usuario > usuarios = new ArrayList();

       public void addUsuario( Usuario usuario ){
              usuarios.add( usuario );
       }

       public Usuario getUsuario( String name ) {
              for (Usuario usuario : usuarios){
                     if ( usuario.getName().equals( name ) ){
                            return usuario;
                     }
              }

              return null;
       }
}
