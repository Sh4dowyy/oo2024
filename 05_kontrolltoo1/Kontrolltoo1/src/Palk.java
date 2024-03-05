import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Palk {
    double algpalk;
    double lopppalk;
    private final List<Double> koefitsiendid = new ArrayList<>();

    public void loeAndmed(String failiNimi) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("andmed.txt"))) {
            String rida;
            while ((rida = br.readLine()) != null) {
                if (rida.startsWith("Algpalk:")) {
                    algpalk = Double.parseDouble(rida.split(":")[1].trim());
                } else if (rida.startsWith("Koef:")) {
                    String[] koef = rida.split(":")[1].trim().split(",");
                    for (String k : koef) {
                        koefitsiendid.add(Double.parseDouble(k.trim()));
                    }
                }
            }
        }
    }

    public void arvutaJaSalvestaPalgad(String failiNimi) throws IOException {
        double praegunePalk = algpalk;
        double kiirendatudPalk = algpalk;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("palgad.txt"))) {
            bw.write("Aasta\tTavapalgatõus\tKiirendatud palgatõus\n");
            for (int i = 0; i < koefitsiendid.size(); i++) {
                praegunePalk *= koefitsiendid.get(i);
                kiirendatudPalk *= koefitsiendid.get(i) * 2;
                bw.write(String.format("%d\t%.2f\t%.2f\n", i + 1, praegunePalk, kiirendatudPalk));
            }
            lopppalk = praegunePalk;
        }
    }
}
