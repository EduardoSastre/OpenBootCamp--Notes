package Java_Avanzado._PatronesDeDiseño.PatronesCreacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.setContador(15);
        singleton2.setContador(10);
        System.out.println( "valor: " + singleton.getContador() + " memoria:" + singleton );
        System.out.println( "valor: " + singleton2.getContador() + " memoria:" + singleton2 );
    }
}
