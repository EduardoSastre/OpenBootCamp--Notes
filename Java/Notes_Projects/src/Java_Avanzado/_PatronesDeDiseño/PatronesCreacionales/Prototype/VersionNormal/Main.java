package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Prototype.VersionNormal;

import Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Prototype.VersionNormal.Coche;

public class Main {
      public static void main(String[] args) {
            Coche coche = new Coche();
            coche.puertas = 5;
            coche.marca = "Nissan";
            coche.modelo = "Deportivo";

            System.out.println( coche.puertas + " " + coche.marca + " " + coche.modelo );

            Coche clonado = coche.clonar();
            System.out.println( clonado.puertas + " " + clonado.marca + " " + clonado.modelo );

      }
}
