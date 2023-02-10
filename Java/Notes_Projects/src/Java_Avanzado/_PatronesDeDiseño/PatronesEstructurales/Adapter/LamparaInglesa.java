package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Adapter;

public class LamparaInglesa {
      boolean powerON = false;
      int voltage = 0;

      public void turnON( int voltage ) {
            powerON = true;
            this.voltage = voltage;

            System.out.println("Lamp turn on with voltage " + voltage);
      }

      public void turnOff() {
            powerON = false;
            this.voltage = 0;
            System.out.println("Lamp turn off");
      }

      public boolean isPowerOn() {
            return powerON;
      }
}
