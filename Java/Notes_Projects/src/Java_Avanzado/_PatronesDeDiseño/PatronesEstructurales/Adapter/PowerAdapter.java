package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Adapter;

public class PowerAdapter implements Enchufable{
      LamparaInglesa lamparaInglesa = new LamparaInglesa(); //Se crea un objeto de la clase que se quiere adaptar

      @Override
      public void enciende() {
            lamparaInglesa.turnON(115);
      }

      @Override
      public void apaga() {
            lamparaInglesa.turnOff();
      }

      @Override
      public boolean estaEncendido() {
            return lamparaInglesa.isPowerOn();
      }
}
