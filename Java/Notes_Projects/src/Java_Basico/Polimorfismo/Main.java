package Java_Basico.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Ferrari", "Azul", 200, new Motor( "Nissan", 8 ) );
        Vehiculo vehiculo2 = new Moto("Kawasaki", "Ninja", "Rojo", 400, new Motor( "Toyota", 4 ), "Montaña" );

        vehiculo1.mostrarEspecificaciones();
        vehiculo2.mostrarEspecificaciones();
    }
}

class Vehiculo {
    String modelo;
    String marca;
    String color;
    int velocidad;
    Motor motor;

    public Vehiculo(){}

    public Vehiculo(String modelo, String marca, String color, int velocidad, Motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void mostrarEspecificaciones(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Motor marca: " + motor.getMarca());
        System.out.println("Motor Cilindros: " + motor.getCilindros());
    }
}

class Motor {
    String Marca;
    int cilindros;

    public Motor() {}

    public Motor(String marca, int cilindros) {
        Marca = marca;
        this.cilindros = cilindros;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}

class Moto extends Vehiculo {
    String tipo;

    public Moto(){}

    public Moto(String modelo, String marca, String color, int velocidad, Motor motor, String tipo) {
        super(modelo, marca, color, velocidad, motor);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarEspecificaciones() {
        System.out.println("otra cosa");
    }
}