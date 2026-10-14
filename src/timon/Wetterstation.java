package timon;

public class Wetterstation extends Subject {

    private int temperatur;
    private int humidity;
    private int pressure;

    public Wetterstation(int temperature, int humidity, int pressure) {
        this.temperatur = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    public int getTemperatur() {
        return temperatur;
    }
    public int getHumidity() {
        return humidity;
    }
    public int getPressure() {
        return pressure;
    }
    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
        this.notifyObservers();
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.notifyObservers();
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
        this.notifyObservers();
    }
}
