package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Mediator;

public class ColegaConcreto1 extends Colega{
      @Override
      void recibe() {
            System.out.println("He recibido un mensaje, soy colegaconcreto1");
      }

      @Override
      void envia() {
            System.out.println("Soy colegaconcreto1, envio un mensaje");
            mediator.reenvia(this);
      }
}
