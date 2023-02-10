package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Singleton;

public class Singleton {

    int contador;
    private static Singleton singleton;

    private Singleton() {} // Para evitar que se pueda usar el constructor desde fuera se el private

    public static Singleton getInstance() { //Por estandar se llama getInstance en este patron
        if ( singleton == null ) {
            singleton = new Singleton();
        }

        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
