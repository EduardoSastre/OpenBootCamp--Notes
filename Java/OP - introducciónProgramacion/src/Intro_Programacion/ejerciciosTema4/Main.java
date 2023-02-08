package Intro_Programacion.ejerciciosTema4;

public class Main {
    public static void main(String[] args) {

        int number1 = generarNumeroAleatorio( -5, 2 );
        int number2 = generarNumeroAleatorio( -1, 1 );
        String[] estaciones = { "Primavera", "Verano", "Otoño", "Invierno", "No Estación"} ;
        String estacionRandom = estaciones [ generarNumeroAleatorio( 0, estaciones.length - 1 ) ];

        if ( number1 > 0 ){
            System.out.println( "La variable num 1 es positiva" );
        } else {
            System.out.println( "La variable num 1 es negativa" );
        }


        System.out.println( "Ciclo while" );

        while( number1 < 3 ){
                number1 ++;
                System.out.println( number1 );
        }

        System.out.println( "Ciclo do while" );

        do{
            number1 ++;
            System.out.println( number1 );
        }
        while ( number1 < 3 );

        System.out.println( "Ciclo for" );

        for ( int i = 0; i <= 3; i++ ){
            number2 ++;
            System.out.println( number2 );
        }

        System.out.println( "Switch case" );

        switch ( estacionRandom  ){
            case "Primavera":
            case "Verano":
            case "Otoño":
            case "Invierno":
                System.out.println( "Es " + estacionRandom);
                break;

            default:
                System.out.println( "Esto no es una estación" );
                break;
        }



    }

    public static int generarNumeroAleatorio( int min, int max ){

        int randomNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return randomNumber;

    }
}
