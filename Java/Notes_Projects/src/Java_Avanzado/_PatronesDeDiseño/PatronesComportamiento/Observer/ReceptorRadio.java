package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Observer;

public class ReceptorRadio implements Receptor{
      @Override
      public void recibe() {
            System.out.println("Señal recibida en radio");
      }
}
