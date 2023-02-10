package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Decorator;

public class Main {
      public static void main(String[] args) {
            TelefonoInteligente telefono = new TelefonoInteligente( new TelefonoBasico() );
            telefono.crear();

            System.out.println("****************************************************************");

            TelefonoNextGen telefono2 = new TelefonoNextGen( new TelefonoInteligente( new TelefonoBasico() ) );
            telefono2.crear();

      }
}
