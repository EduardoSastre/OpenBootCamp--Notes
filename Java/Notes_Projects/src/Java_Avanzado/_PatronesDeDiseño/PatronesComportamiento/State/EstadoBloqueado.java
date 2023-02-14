package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoBloqueado extends Estado{
      public EstadoBloqueado(Telefono telefono) {
            super(telefono);
      }

      @Override
      public String desbloquear() {
            telefono.cambiarEstado( new EstadoDesbloqueado( telefono ) );
            return "desbloquear(): Movil desbloqueado";
      }

      @Override
      public String abrirCamara() {
            return "abrirCamara(): La camara esta bloqueada. Desbloquea el telefono primero";
      }

      @Override
      public String hacerFoto() {
            return "hacerFoto(): La camara esta bloqueada. Desbloquea el telefono primero";
      }
}
