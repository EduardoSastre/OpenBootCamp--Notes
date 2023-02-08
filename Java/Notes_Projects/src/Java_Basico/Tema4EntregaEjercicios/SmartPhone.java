package Java_Basico.Tema4EntregaEjercicios;

public class SmartPhone extends SmartDevice{

    private int appsNumber;

    public SmartPhone() {}

    public SmartPhone(String context, String processorName, boolean connectionWifi, int appsNumber) {
        super(context, processorName, connectionWifi);
        this.appsNumber = appsNumber;
    }

    public int getAppsNumber() {
        return appsNumber;
    }

    public void setAppsNumber(int appsNumber) {
        this.appsNumber = appsNumber;
    }

    @Override
    public void showCharacteristics() {
        System.out.println( "********** SmartPhone **********" );
        super.showCharacteristics();
        System.out.println("Number of apps: " + appsNumber);
    }
}
