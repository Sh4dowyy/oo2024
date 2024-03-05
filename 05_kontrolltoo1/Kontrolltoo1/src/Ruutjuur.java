import java.util.List;

public class Ruutjuur {
    public double arvutaRuutjuur(double a, double b) {
        double tulemus = a * b;
        return Math.sqrt(tulemus);
    }

    public double arvutaTeineRuutjuur(List<Double> arvud) {
        double korrutis = 1;
        for (Double arv : arvud) {
            korrutis *= arv;
        }

        double n = arvud.size();
        return Math.pow(korrutis, 1 / n);
    }
}