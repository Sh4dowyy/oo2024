import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // saab enda terve hunniku funktsioone ja muutujaid

        Random random = new Random(); // saab enda terve hunniku funktsioone ja muutujaid

        Maailm maailm = new Maailm(5, 10);

        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        List<Tegelane> tegelased = new ArrayList<>();
        tegelased.add(mangija);
        tegelased.add(ork);
        tegelased.add(draakon);

        Ese m66k = new Ese("Mõõk", 10, 1, random, maailm);
        Ese saabas = new Ese("Saabas", 5, 3, random, maailm);
        Ese hammer = new Ese("Hammer", 1, 5,  random, maailm);
        List<Ese> esemed = new ArrayList<>();
        esemed.add(m66k);
        esemed.add(saabas);
        esemed.add(hammer);

        Scanner scanner = new Scanner(System.in); // järegmine tunni teema

        maailm.prindiKaart(tegelased, esemed);

        String sisend = scanner.nextLine();

        mangija.liigu(sisend, maailm);

        while (!sisend.equals("end")) { // m.equals() --> ==    !m.equals() --> !=
            maailm.prindiKaart(tegelased, esemed);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);
            for (Ese e: esemed) {
                if (mangija.xCoord == e.xCoord && mangija.yCoord == e.yCoord) {
                    mangija.ese = e;
                    System.out.println("Kojasid üles eseme: " + e.nimetus);
                    break;
                }
            }

            // esemed.forEach(e =>  { if (e.xCoord && e.yCoord)})

        }
    }//main (args[])
}//Main()