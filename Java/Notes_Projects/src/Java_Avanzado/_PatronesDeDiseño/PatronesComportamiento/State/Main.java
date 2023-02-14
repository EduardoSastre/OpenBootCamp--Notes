package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.State;

public class Main {
      public static void main(String[] args) {
            Telefono telefono1 = new Telefono();


            //Here the default state is EstadoBloqueado
            System.out.println( telefono1.estado.hacerFoto() );
            System.out.println( telefono1.estado.abrirCamara() );

            System.out.println();

            //Here the state changes to EstadoDesbloqueado

            System.out.println( telefono1.estado.desbloquear() );
            System.out.println( telefono1.estado.hacerFoto() );
            System.out.println( telefono1.estado.abrirCamara() );

            System.out.println();

            //Here the state changes to EstadoCamaraAbierta
            System.out.println( telefono1.estado.hacerFoto() );

            System.out.println();

            //Here the state changes to EstadoHacerFoto
            System.out.println( telefono1.estado.hacerFoto() );



      }
}
