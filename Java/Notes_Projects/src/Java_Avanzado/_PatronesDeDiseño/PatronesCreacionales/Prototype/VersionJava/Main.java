package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Prototype.VersionJava;

import Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Prototype.VersionNormal.Coche;

public class Main {
      public static void main(String[] args) {
            Coche_ coche = new Coche_();
            coche.puertas = 5;
            coche.marca = "Nissan";
            coche.modelo = "Deportivo";

            System.out.println( coche.puertas + " " + coche.marca + " " + coche.modelo );

            try {
                  Coche_ clonado = coche.clonar();
                  System.out.println( clonado.puertas + " " + clonado.marca + " " + clonado.modelo );
            } catch (CloneNotSupportedException e) {
                  System.out.println( "No se puede clonar" + e.getMessage() );
            }


      }
}
