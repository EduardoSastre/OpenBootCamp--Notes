package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Observer;

public class main {
      public static void main(String[] args) {
            Emisor emisor = new Emisor();

            ReceptorRadio radio = new ReceptorRadio();
            ReceptorSatelite satelite = new ReceptorSatelite();
            ReceptorTv tv = new ReceptorTv();

            emisor.addReceptor(radio);
            emisor.addReceptor(satelite);
            emisor.addReceptor(tv);

            emisor.transmit();

      }
}
