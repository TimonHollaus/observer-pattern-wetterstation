package timon;

public class Statistken implements Observer {
    private Wetterstation wetter;
    public Statistken(Wetterstation wetter) {
        this.wetter = wetter;
    }
    public void anzeigen(){
        System.out.println("Statistik: " + wetter.getTemperatur() + " | " +
                                            wetter.getHumidity() + " | " +
                                            wetter.getPressure());
    }


    @Override
    public void update() {
        this.anzeigen();
    }
}
