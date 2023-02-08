package Intro_Programacion.Tema10Interfaces;

public class Main {
    public static void main(String[] args) {
        Coche car1 = new Coche();
        Moto motorBike1 = new Moto();


        EjecutaAcelerar( car1 );
        EjecutaAcelerar( motorBike1 );
    }

    public static void EjecutaAcelerar( Vehiculo transporte ){ //The parameter require a class that implements the interface "Vehiculo"
        transporte.acelerar( 15 );
    }
}

interface Vehiculo {
    void acelerar( int velocidad );
    void frenar( int velocidad );
}

class Coche implements Vehiculo {
    public void acelerar( int velocidad ){
        System.out.println( "Coche -- acelerar" );
    }

    public void frenar( int velocidad ){
        System.out.println( "Coche -- frenar" );
    }
}

class Moto implements Vehiculo {
    public void acelerar( int velocidad ){
        System.out.println( "Moto -- acelerar" );
    }

    public void frenar( int velocidad ){
        System.out.println( "Moto -- frenar" );
    }
}