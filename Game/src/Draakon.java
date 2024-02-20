import java.util.Random;

public class Draakon extends Tegelane {
    // konstruktor
    public Draakon(Random random, int kaardiKorgus, int kaardiLaius) {
            xCoord = saaKoordinaat(random, kaardiLaius); // initsialiseerin (annan esimest
            yCoord = saaKoordinaat(random, kaardiKorgus);
            symbol = 'D';
    }
    private int saaKoordinaat(Random random, int kaart) {
        return random.nextInt(1, kaart - 1);
    }
}
