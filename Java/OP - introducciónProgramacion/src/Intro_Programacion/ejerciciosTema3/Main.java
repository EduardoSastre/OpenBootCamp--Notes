package Intro_Programacion.ejerciciosTema3;

public class Main {

    public static void main(String[] args) {

            //First part
            imprimirSumaNumeros( 2, 4, 6 );

            //Second part
            miCoche car1 = new miCoche();
            car1.addOneDoor();
            car1.showCarDoors();

    }

    //First Part
    public static  int sumaNumeros ( int num1, int num2, int num3 ){
        return num1 + num2 + num3;
    }

    public static void imprimirSumaNumeros( int num1, int num2, int num3  ){
            System.out.println( "La suma de los números "+ num1 +", "+ num2 +" y " + num3 + " es: " + sumaNumeros( num1, num2, num3 ) );
    }



}

//Second Part

class miCoche {
    private int carDoors;

    public void addOneDoor(){
        carDoors ++;
    }

    public void showCarDoors(){
        System.out.println( "Número de puertas: " + carDoors );
    }
}