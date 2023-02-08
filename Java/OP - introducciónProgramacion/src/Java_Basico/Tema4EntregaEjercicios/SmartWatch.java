package Java_Basico.Tema4EntregaEjercicios;

public class SmartWatch extends SmartDevice{

    boolean checkCaloriesBurned;

    public SmartWatch() {}

    public SmartWatch(String context, String processorName, boolean connectionWifi, boolean checkCaloriesBurned) {
        super(context, processorName, connectionWifi);
        this.checkCaloriesBurned = checkCaloriesBurned;
    }

    public boolean isCheckCaloriesBurned() {
        return checkCaloriesBurned;
    }

    public void setCheckCaloriesBurned(boolean checkCaloriesBurned) {
        this.checkCaloriesBurned = checkCaloriesBurned;
    }

    @Override
    public void showCharacteristics() {
        System.out.println( "********** SmartWatch **********" );
        super.showCharacteristics();
        System.out.println("Check Calories Burned: " + checkCaloriesBurned);
    }
}
