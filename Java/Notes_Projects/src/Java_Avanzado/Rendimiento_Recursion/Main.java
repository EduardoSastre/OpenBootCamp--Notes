package Java_Avanzado.Rendimiento_Recursion;

public class Main {
    public static void main(String[] args) {

        System.out.println( "Tail Recursion: " );
        tailRecursion( 5 );
        System.out.println( "Head Recursion: " );
        headRecursion( 5 );

    }

    public static void tailRecursion( int numero ){
        if ( numero == 0 ){
            return;
        }

        System.out.println( numero );
        tailRecursion( numero - 1);
    }

    public static void headRecursion( int numero ){
        if ( numero == 0 ){
            return;
        }

        headRecursion( numero - 1);
        System.out.println( numero );

    }
}
