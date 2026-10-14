package timon;

import java.sql.SQLOutput;
import java.util.Observable;

public class AktuelleBedingungen implements Observer {
    private Wetterstation wetter;
    public AktuelleBedingungen(Wetterstation wetter) {
        this.wetter = wetter;
    }
    public void anzeigen(){
        System.out.println("Aktuelle Bedingungen: " + wetter.getTemperatur() + " | " +
                                                        wetter.getHumidity() + " | " +
                                                        wetter.getPressure());
    }


    @Override
    public void update() {
        this.anzeigen();
    }
}
