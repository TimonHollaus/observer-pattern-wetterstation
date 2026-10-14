package timon;

public class Vorhersage implements Observer {

    private Wetterstation wetter;

    public Vorhersage(Wetterstation wetter) {
        this.wetter = wetter;
    }
    public void anzeigen(){
        System.out.println("Vorhersage: " + wetter.getTemperatur() + " | " +
                wetter.getHumidity() + " | " +
                wetter.getPressure());
    }


    @Override
    public void update() {
        this.anzeigen();
    }
}
