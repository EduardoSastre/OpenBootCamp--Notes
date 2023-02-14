package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoCamaraAbierta extends Estado{
      public EstadoCamaraAbierta(Telefono telefono) {
            super(telefono);
      }

      @Override
      public String desbloquear() {
            return "desbloquear(): El telefono ya estaba desbloqueado";
      }

      @Override
      public String abrirCamara() {
            return "abrirCamara(): La camara ya estaba abierta";
      }

      @Override
      public String hacerFoto() {
            telefono.cambiarEstado( new EstadoHacerFoto( telefono ) );
            return "hacerFoto(): Se puede tomar una foto";
      }
}
