package Java_Avanzado._PatronesDeDiseño.PatronesEstructurales.Adapter;

public class Main {
      public static void main(String[] args) {
            Horno horno = new Horno();
            Lampara lampara = new Lampara();
            PowerAdapter lamparaInglesa = new PowerAdapter();

            enciende(horno);
            enciende(lampara);
            enciende(lamparaInglesa);
      }

      public static void enciende ( Enchufable dispositivo ){
            dispositivo.enciende();
      }

      public static void apaga ( Enchufable dispositivo ){
            dispositivo.apaga();
      }

      public static boolean estaEncendido ( Enchufable dispositivo ){
            return dispositivo.estaEncendido();
      }
}
