//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // KODUS: 3 funktsiooni, milles on kasutatud vähemalt
        // nelja erinevad tüüpi:
        // void, String, int, char, long, double, float, boolean
        // tagastab int   parameetriks boolean
        // tagastab void   parameetriks boolean, int
        // tagastab String    parameetriks String

        // teha igast funkstioonist 2 erineva sisendiga väljakutset

        double kogumakssumma1 = arvutaTaksoMaksmus(3);
        System.out.println(kogumakssumma1);
        double kogumakssumma2 = arvutaTaksoMaksmus(2);
        System.out.println(kogumakssumma2);
        String hinnang1 = temperatuuriHinnang(-1.2);
        System.out.println(hinnang1);
        String hinnang2 = temperatuuriHinnang(2);
        System.out.println(hinnang2);
        prindiForTsykkel("Pikk sona");
    }

    private static double arvutaTaksoMaksmus(int tunnid) {
        return 3 + 0.9 * tunnid;
    }

    private static String temperatuuriHinnang(double temp) {
        if (temp < 0) {
            return "Vesi on jääs";
        } else {
            return "On vesi";
        }
    }

    private static void prindiForTsykkel(String tahtedeArv) {
        for (int i = 0; i < tahtedeArv.length(); i++) {
            System.out.println(i);
        }
    }
}