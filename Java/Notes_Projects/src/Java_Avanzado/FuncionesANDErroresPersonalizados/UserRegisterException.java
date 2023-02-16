package Java_Avanzado.FuncionesANDErroresPersonalizados;

public class UserRegisterException extends UserException{

      public UserRegisterException( String message ) {

            super( "Usuario ya existe: " + message );

      }

}
