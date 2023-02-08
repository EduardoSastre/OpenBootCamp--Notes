package Java_Basico.Tema5EntregaEjercicios;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Car saved");
    }

    @Override
    public void findAll() {
        System.out.println("All cars founded");
    }

    @Override
    public void delete() {
        System.out.println("Car deleted");
    }
}
