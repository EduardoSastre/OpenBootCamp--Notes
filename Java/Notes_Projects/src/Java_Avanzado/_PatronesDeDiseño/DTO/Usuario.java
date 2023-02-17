package Java_Avanzado._PatronesDeDiseño.DTO;

import java.util.ArrayList;

public class Usuario {

       private String name;
       private ArrayList< Vehiculo > vehiculos;
       private Usuario(){}

       public Usuario(String name){
              this.name = name;
       }


       public String getName() {

              return name;
       }

       public void setName( String name ) {

              this.name = name;
       }

       public void addVehiculo( Vehiculo[] vehiculos ){
              for( Vehiculo vehiculo : vehiculos ){
                     this.vehiculos.add( vehiculo );
              }

       }

}
