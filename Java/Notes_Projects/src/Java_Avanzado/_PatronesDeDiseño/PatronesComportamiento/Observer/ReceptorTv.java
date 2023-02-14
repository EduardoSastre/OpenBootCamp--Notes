package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Observer;

public class ReceptorTv implements Receptor{
      @Override
      public void recibe() {
            System.out.println("Señal recibida en Tv");
      }
}
