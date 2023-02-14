package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoDesbloqueado extends Estado{
      public EstadoDesbloqueado(Telefono telefono) {
            super(telefono);
      }

      @Override
      public String desbloquear() {
            return "desbloquear(): El telefono ya esta desbloqueado";
      }

      @Override
      public String abrirCamara() {
            telefono.cambiarEstado( new EstadoCamaraAbierta(telefono) );
            return "abrirCamara(): Camara abierta";
      }

      @Override
      public String hacerFoto() {
            return "hacerFoto(): No se puede hacer una foto sin abrir la camara";
      }
}
