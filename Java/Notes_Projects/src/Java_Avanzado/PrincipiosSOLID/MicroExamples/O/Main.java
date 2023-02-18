package Java_Avanzado.PrincipiosSOLID.MicroExamples.O;

public class Main {

       /* ----------------------Bad implemetation----------------------------------
       public static void main( String[] args ) {


              Vehiculo []vehiculos = {
                     new Vehiculo( "Moto" ),
                     new Vehiculo( "Coche" )
              };

              imprimirPotenciaVehiculos( vehiculos );

       }

       public static void imprimirPotenciaVehiculos( Vehiculo []vehiculos ){

              //--------------------This is a problem, when a vehiculo in vehiculos is added, this method must be changed

              for ( Vehiculo vehiculo : vehiculos ){

                     if ( vehiculo.getTipo().equalsIgnoreCase( "coche" ) ){
                            System.out.println( "Potencia: 1000" );
                     } else {
                            System.out.println( "Potencia: 500" );
                     }

              }
       }

        */

       //To solution this, Vehiculo becomes an abstract class, the array vehiculos is saving different child instances
       // and in the function imprimirPotenciaVechiculos is only needed calling the respective method of the child class
       // ( a method that must be implemented for the children because they inherit from an abstract class ).

       public static void main( String[] args ) {

              //Here can be added new types of vehicles without needing to modify the function imprimirPotenciaVechiculos
              Vehiculo[] vehiculos = {
                     new Coche(),
                     new Furgoneta(),
                     new Moto()
              };

              imprimirPotenciaVehiculos( vehiculos );

       }

       public static void imprimirPotenciaVehiculos( Vehiculo[] vehiculos ) {

              for ( Vehiculo vehiculo : vehiculos ) {

                     System.out.println( "Potencia: " + vehiculo.getPotencia() );

              }


       }

}