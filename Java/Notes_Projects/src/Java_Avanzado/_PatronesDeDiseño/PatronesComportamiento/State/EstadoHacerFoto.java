package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoHacerFoto extends Estado{
      public EstadoHacerFoto(Telefono telefono) {
            super(telefono);
      }

      @Override
      public String desbloquear() {
            return "El telefono ya esta desbloqueado";
      }

      @Override
      public String abrirCamara() {
            return "La camara ya esta abierta";
      }

      @Override
      public String hacerFoto() {
            //telefono.cambiarEstado( new EstadoBloqueado( telefono ) ); //This can reset the states to the beginning
            return "La foto se ha tomado!!!!";
      }
}
