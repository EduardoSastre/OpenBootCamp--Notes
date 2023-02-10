package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Prototype.VersionNormal;

public class Coche {
      public String marca;
      public String modelo;
      public int puertas;

      public Coche (){}

      public Coche clonar(){
            Coche clon = new Coche();
            clon.marca = this.marca;
            clon.modelo = this.modelo;
            clon.puertas = this.puertas;

            return clon;
      }
}
