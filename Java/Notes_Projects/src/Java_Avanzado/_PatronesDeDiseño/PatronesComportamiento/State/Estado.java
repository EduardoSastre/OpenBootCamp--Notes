package Java_Avanzado._PatronesDeDiseño.PatronesComportamiento.State;

public abstract class Estado {

      public Telefono telefono;

      public Estado(Telefono telefono) {
            this.telefono = telefono;
      }

      abstract public String desbloquear();
      abstract public String abrirCamara();
      abstract public String hacerFoto();

}
