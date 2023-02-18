package Java_Avanzado.PrincipiosSOLID.MicroExamples.O;

abstract class Vehiculo {

       private String tipo;

       public Vehiculo(){}

       /* Bad implementaion -- Check main for context

       public Vehiculo( String tipo ){
              this.tipo = tipo;
       }
       public String getTipo() {
              return tipo;
       }

       */
       abstract public int getPotencia();


}
