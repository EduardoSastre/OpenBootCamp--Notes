package Java_Avanzado.PrincipiosSOLID.MicroExamples.S;

public class Vehiculo {

       private String tipo;

       private Vehiculo(){}

       public Vehiculo( String tipo ){
              this.tipo = tipo;
       }

       public String getTipo() {

              return tipo;
       }

       /*

       This violates the S of solid, the class vehiculo mustn't have another responsability
       For that reason this is implemented in another class ( VehiculoDB )

       public void guardarVehiculoDB( Vehiculo vehiculo ){
              //Codigo para guarda en DB
       }

       */


}
