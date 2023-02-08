package Java_Basico.Tema5EntregaEjercicios;

public class Main {
    public static void main(String[] args) {
        //Polimorfism --- Object of type CocheCrud acts like CocheCrudImpl
        CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}
