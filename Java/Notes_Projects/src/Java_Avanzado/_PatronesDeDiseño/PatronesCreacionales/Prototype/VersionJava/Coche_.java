package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Prototype.VersionJava;

public class Coche_ implements Cloneable {
      public String marca;
      public String modelo;
      public int puertas;

      public Coche_(){}

      public Coche_ clonar() throws CloneNotSupportedException {
            return (Coche_) this.clone();
      }
}
