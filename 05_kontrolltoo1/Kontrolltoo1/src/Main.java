//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Geomeetriline keskmine

//* Koosta klass ja tema sisse funktsioon, mis korrutab parameetritena antud kaks arvu ning võtab neist ruutjuure (Math.sqrt). Katseta.
//* Koosta klassi sisse teine funktsioon, kuhu võib arve rohkem sisestada, need antakse ette kogumina. Arvud korrutatakse kokku ning võetakse niimitmes juur (astendaja pöördväärtus, Math.pow), kuimitu arvu oli.
//* Failis on viie aasta kohta koefitsiendid, kui palju igal aastal palk muutus (ise koosta testandmed). Samuti esimese aasta palk. Anna nii alg- kui ka lõppsumma klassi sees asuvatesse muutujatesse. Seejärel väljasta teise faili palk igal aastal neist ning võrdlusena kõrvale palk, kui palk oleks tõusnud iga aasta järel eelmistest koefitsentidest 2 korda kiiremini (kõik koefitsendid kahega korrutatult).



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Ruutjuur ruutjuur = new Ruutjuur();
        double a = 4;
        double b = 9;

        double tulemus1 = ruutjuur.arvutaRuutjuur(a, b);
        System.out.println("Tulemus on: " + tulemus1);

        List<Double> arvud = new ArrayList<>();
        arvud.add(2.0);
        arvud.add(8.0);
        arvud.add(4.0);
        double tulemus2 = ruutjuur.arvutaTeineRuutjuur(arvud);
        System.out.println("Teise ülesanne tulemus on: " + tulemus2);

        Palk palk = new Palk();
        palk.loeAndmed("andmed.txt");
        palk.arvutaJaSalvestaPalgad("palgad.txt");
        System.out.println("Algpalk: " + palk.algpalk);
        System.out.println("Lõpppalk tavapärase tõusuga: " + palk.lopppalk);
        }
    }


