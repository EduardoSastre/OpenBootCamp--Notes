package Java_Basico.Tema789EntregaEjercicios.Ejercicio3;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {
        Vector<String> nombres = new Vector<String>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Jose");

        nombres.remove(1);
        nombres.remove(1);

        System.out.println(nombres);

    }
}
