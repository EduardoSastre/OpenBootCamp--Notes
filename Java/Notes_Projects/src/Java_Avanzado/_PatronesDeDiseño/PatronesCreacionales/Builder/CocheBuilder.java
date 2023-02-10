package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Builder;

public class CocheBuilder {

      Vehiculo vehiculo;

      public CocheBuilder( String marca ) {
            vehiculo = new Vehiculo();
            vehiculo.marca = marca;
      }

      public CocheBuilder setPuertas( int puertas ) { //Regresa la instancia actual CocheBuilder
            vehiculo.puertas = puertas;
            return this;
      }

      public CocheBuilder setMotor( String motor ) { //Regresa la instancia actual CocheBuilder
            vehiculo.motor = motor;
            return this;
      }

      public Vehiculo build(){ //Por estandar se llama build en este patron
            return this.vehiculo;
      }
}
