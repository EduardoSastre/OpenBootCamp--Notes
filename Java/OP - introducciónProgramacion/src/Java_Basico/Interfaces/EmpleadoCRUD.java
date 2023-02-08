package Java_Basico.Interfaces;

import Java_Basico.ArrayList.Empleado;
import java.util.List;

public interface EmpleadoCRUD {

    public void save(Empleado empleado);
    public List<Empleado> findAll();
    public void delete( int id );
    public void update( Empleado empleado );


}
