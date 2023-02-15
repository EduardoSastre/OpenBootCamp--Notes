package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements Usuarios{
      private ArrayList<String> usuarios = new ArrayList<String>();

      @Override
      public void crear(String usuario){
            usuarios.add(usuario);
      }

      @Override
      public ArrayList<String> lista(){
            return usuarios;
      }
}
