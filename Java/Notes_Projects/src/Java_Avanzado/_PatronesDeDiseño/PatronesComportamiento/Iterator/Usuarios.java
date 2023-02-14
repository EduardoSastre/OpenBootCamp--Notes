package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator { //The plural to iterate over, for iterators this is the best fit name

      private ArrayList<Usuario> usuarios = new ArrayList();
      private int index = 0;

      public void create ( Usuario usuario ){
            usuarios.add( usuario );
      }
      @Override
      public Usuario next() {
            Usuario usuario = usuarios.get( index );
            index += 1;
            return usuario;
      }

      @Override
      public void reset() {
            index = 0;
      }

      @Override
      public Boolean hasMore() {
            return index < usuarios.size();
      }

}
