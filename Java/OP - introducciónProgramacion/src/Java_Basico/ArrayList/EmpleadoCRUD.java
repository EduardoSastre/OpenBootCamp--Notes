package Java_Basico.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>();

    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
