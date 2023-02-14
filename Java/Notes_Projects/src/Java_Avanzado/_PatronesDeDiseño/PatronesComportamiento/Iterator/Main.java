package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Iterator;

public class Main {
      public static void main(String[] args) {
            Usuarios usuarios = new Usuarios();
            usuarios.create( new Usuario("User1", 1) );
            usuarios.create( new Usuario("User2", 2) );
            usuarios.create( new Usuario("User3", 3) );
            usuarios.create( new Usuario("User4", 4) );

            while (usuarios.hasMore() ){
                  Usuario usuario = usuarios.next();
                  System.out.println("Usuario: " + usuario.getNombre());
            }

            usuarios.create( new Usuario("User5", 4) );
            Usuario usuario = usuarios.next(); //the inside attribute index is maintained
            System.out.println("Usuario: " + usuario.getNombre());

            while (usuarios.hasMore() ){ //The index is the maximum, for that reason this code doesn't apply
                  usuario = usuarios.next();
                  System.out.println("Usuario: " + usuario.getNombre());
            }


            System.out.println();

            usuarios.reset(); //the inside attribute index becomes 0
            while (usuarios.hasMore() ){
                  usuario = usuarios.next();
                  System.out.println("Usuario: " + usuario.getNombre());
            }
      }
}
