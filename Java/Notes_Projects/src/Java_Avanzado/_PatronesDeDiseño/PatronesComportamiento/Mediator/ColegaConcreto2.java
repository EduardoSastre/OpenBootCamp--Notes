package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.Mediator;

public class ColegaConcreto2 extends Colega{
      @Override
      void recibe() {
            System.out.println("He recibido un mensaje, soy colegaconcreto2");
      }

      @Override
      void envia() {
            System.out.println("Soy colegaconcreto2, envio un mensaje");
            mediator.reenvia(this);
      }
}
