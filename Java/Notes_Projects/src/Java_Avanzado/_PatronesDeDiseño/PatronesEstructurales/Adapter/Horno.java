package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Adapter;

public class Horno implements Enchufable{
      boolean encendido = false;

      @Override
      public void enciende() {

            encendido = true;
            System.out.println("Horno encendido");
      }

      @Override
      public void apaga() {

            encendido = false;
            System.out.println("Horno apagado");
      }

      @Override
      public boolean estaEncendido() {
            return encendido;
      }
}
