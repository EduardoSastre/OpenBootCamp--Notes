package Java_Avanzado.FuncionesANDErroresPersonalizados;

public class Main {

      public static void main(String[] args) {

            Usuarios usuarios = new Usuarios();
            Usuario usuario = new Usuario( "Juana", "Maria", 18 );

            try {

                  usuarios.addUsuario( usuario );
                  usuarios.addUsuario( usuario );

            } catch ( UserException e ) {

                  System.out.println("Error al añadir el usuario: " + e.getMessage());

            }

      }

}
