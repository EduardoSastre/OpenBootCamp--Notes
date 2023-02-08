package Java_Basico.Tema4EntregaEjercicios;

public class Main {

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Personal Device", "SnapDragon680", true, 32);
        SmartWatch watch = new SmartWatch("Personal Device", "SnapDragon680", true, true);

        phone.showCharacteristics();
        System.out.println();
        watch.showCharacteristics();
    }

}
