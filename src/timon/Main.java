package timon;

public class Main {
    public static void main(String[] args) {
        Wetterstation wetterstation = new Wetterstation(35, 24214, 800);
        wetterstation.attach(new AktuelleBedingungen(wetterstation));
        wetterstation.attach(new Statistken(wetterstation));
        wetterstation.attach(new Vorhersage(wetterstation));
        wetterstation.setHumidity(1);
        System.out.println(" ");
        wetterstation.setTemperatur(25);
    }
}
