package Java_Basico.Tema4EntregaEjercicios;

public class SmartDevice {
    protected String context;
    protected String processorName;
    protected boolean connectionWifi;

    public SmartDevice(){}
    public SmartDevice(String context, String processorName, boolean connectionWifi) {
        this.context = context;
        this.processorName = processorName;
        this.connectionWifi = connectionWifi;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public boolean isConnectionWifi() {
        return connectionWifi;
    }

    public void setConnectionWifi(boolean connectionWifi) {
        this.connectionWifi = connectionWifi;
    }

    public void showCharacteristics() {
        System.out.println("Characteristics:");
        System.out.println("Processor: " + processorName);
        System.out.println("Context: " + context);
        System.out.println("Connection Wifi: " + connectionWifi);
    }
}
