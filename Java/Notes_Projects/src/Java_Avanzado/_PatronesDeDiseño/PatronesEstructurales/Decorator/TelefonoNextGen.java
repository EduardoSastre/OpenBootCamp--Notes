package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Decorator;

public class TelefonoNextGen extends TelefonoDecorator{
      public TelefonoNextGen(Telefono telefono) {
            super(telefono);
      }

      @Override
      public void crear() {
            super.crear();
            System.out.println("Nextgen: Tengo tambien 5G");
            System.out.println("Nextgen: Tengo tambien Volte");
      }
}
