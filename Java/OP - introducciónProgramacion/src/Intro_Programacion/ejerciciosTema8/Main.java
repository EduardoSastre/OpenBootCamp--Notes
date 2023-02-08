package Intro_Programacion.ejerciciosTema8;

public class Main {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.setEdad( 25 );
        person1.setNombre( "Paty" );
        person1.setTelefono( "9991596512" );
        person1.mostrarDatos();
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad( int edad ){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTelefono( String telefono ){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }

    public void mostrarDatos(){
        System.out.println( "Nombre: " + nombre + ", " + "edad: " + edad + ", " + "telefono: " +telefono );
    }
}