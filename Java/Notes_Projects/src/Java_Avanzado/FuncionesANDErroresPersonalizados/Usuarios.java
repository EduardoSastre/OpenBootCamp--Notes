package Java_Avanzado.FuncionesANDErroresPersonalizados;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class Usuarios {
      public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

      public void addUsuario(Usuario ...usuarios) throws UserException { //throws UserException, AnotherException, Another .... //Here can be multiples exceptions

            for ( Usuario usuario : usuarios ) {

                  if ( this.usuarios.contains( usuario ) ) {
                        throw new UserRegisterException( usuario.nombre );
                  }

                  this.usuarios.add( usuario );

            }

      }

}
