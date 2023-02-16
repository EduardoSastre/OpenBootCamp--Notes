package Java_Avanzado.FuncionesANDErroresPersonalizados;

public class UserException  extends Exception {

      public UserException(String message) {
            super("UserException: " + message);
      }

}
