package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Factory;

public class PrecioFactory {
      Precio precio; //Esta interfaz debe instanciarse con alguna clase que implemente precio
      private PrecioFactory(){} //Private para que no se pueda usar fuera de la clase

      public PrecioFactory( String pais ){
            if ( pais.equalsIgnoreCase(  "España")){
                  System.out.println("Precio en EUR");
                  precio = new PrecioEUR();
            } else {
                  System.out.println("Precio en USD");
                  precio = new PrecioUSD();
            }
      }

}
