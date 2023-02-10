package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Decorator;

public class TelefonoBasico implements Telefono{

      @Override
      public void crear() {
            System.out.println("Soy un telefono basico con estas caracteristicas:");
            tengoGMS();
            tengoSMS();
      }

      private void tengoSMS(){
            System.out.println("Basico: -> Tengo SMS");
      }

      private void tengoGMS(){
            System.out.println( "Basico: -> Tengo GMS");
      }
}
