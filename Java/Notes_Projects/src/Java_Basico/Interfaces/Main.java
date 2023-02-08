package Java_Basico.Interfaces;

import Java_Basico.ArrayList.Empleado;

public class Main {
    public static void main(String[] args) {

        //Polimorfism
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDPostgreSQL();
        //EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDPostgreSQL();
        //EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySql();
        //EmpleadoCRUD empleadoCRUD; In this case springe injects something here

        empleadoCRUD.save( new Empleado() );
        empleadoCRUD.findAll();

    }
}
