package Intro_Programacion.ejerciciosTema9;

public class Main {
    public static void main(String[] args) {
        Cliente client1 = new Cliente( 20, "Emanuel", "9995558792", 20000 );
        client1.mostrarDatos();

        Trabajador worker1 = new Trabajador( 25, "Patricia", "5559991503", 100000 );
        worker1.mostrarDatos();
    }
}

interface MuestraDatos {
    void mostrarDatos();
}

class Persona {
    int edad;
    String nombre;
    String telefono;

    Persona( int edad, String nombre, String telefono ){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

class Cliente extends Persona implements MuestraDatos {
    int credito;

    Cliente( int edad, String nombre, String telefono, int credito ){
        super( edad, nombre, telefono );
        this.credito = credito;
    }

    public void mostrarDatos(){
        System.out.println( "Edad: " + edad  );
        System.out.println( "Nombre: " + nombre );
        System.out.println( "Telefono: " + telefono );
        System.out.println( "Credito: " + credito );
    }
}

class Trabajador extends Persona implements MuestraDatos {
    int salario;

    Trabajador( int edad, String nombre, String telefono, int salario ){
        super( edad, nombre, telefono );
        this.salario = salario;
    }

    public void mostrarDatos(){
        System.out.println( "Edad: " + edad  );
        System.out.println( "Nombre: " + nombre );
        System.out.println( "Telefono: " + telefono );
        System.out.println( "Credito: " + salario );
    }
}