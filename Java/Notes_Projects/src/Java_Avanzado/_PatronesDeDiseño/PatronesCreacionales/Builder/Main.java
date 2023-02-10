package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Builder;

public class Main {
      public static void main(String[] args) {
            /* Sin builder
            Vehiculo vehicle = new Vehiculo();
            vehicle.setMarca("Nissan");
            vehicle.setPuertas(4);
            vehicle.setMotor("Electrico");
            */

            //Con builder
            Vehiculo coche = new CocheBuilder("Nissan")
                  .setPuertas(5)
                  .setMotor("Electrico")
                  .build();

            //CocheBuilder puede acceder al metodo set puertas
            //setPuertas asigna 5 al objeto vehiculo dentro y pasa a convertirse es un CocheBuilder, por lo que puede invocar a setMotor()
            //setMotor asigna el tipo de motor al objeto vehiculo dentro y pasa a convertirse en un CocheBuilder, por lo que puede invocar a build()
            //build regresa el vehiculo que esta dentro de cocheBuilder
      }
}
