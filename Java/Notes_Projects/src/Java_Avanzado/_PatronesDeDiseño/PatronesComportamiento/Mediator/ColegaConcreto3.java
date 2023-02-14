package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Mediator;

public class ColegaConcreto3 extends Colega{
      @Override
      void recibe() {
            System.out.println("He recibido un mensaje, soy colegaconcreto3");
      }

      @Override
      void envia() {
            System.out.println("Soy colegaconcreto3, envio un mensaje");
            mediator.reenvia(this);
      }
}
