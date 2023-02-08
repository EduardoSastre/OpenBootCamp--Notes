package Java_Basico.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD Empleados = new EmpleadoCRUD();

        Empleado Juan = new Empleado( "Juan", "Jimenez", 40000 );
        Empleado Maria = new Empleado( "Maria", "Sanchez", 50000 );
        Empleado Pancho = new Empleado( "Karen", "Martinez", 90000 );

        Empleados.save( Juan );
        Empleados.save( Maria );
        Empleados.save( Pancho );

        List<Empleado> empleados = Empleados.findAll();
        System.out.println(empleados);
    }
}
