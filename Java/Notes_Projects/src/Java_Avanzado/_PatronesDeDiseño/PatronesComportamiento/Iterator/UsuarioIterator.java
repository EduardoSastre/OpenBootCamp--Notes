package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Iterator;

public interface UsuarioIterator {
      //The most commonly used
      Usuario next(); //Get the next user
      void reset(); //Reset the users count
      Boolean hasMore(); //Are there more users?
}
