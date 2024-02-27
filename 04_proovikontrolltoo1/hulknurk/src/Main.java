import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> kolmnurk1xCoord = new ArrayList<>();
        kolmnurk1xCoord.add(6);
        kolmnurk1xCoord.add(8);
        kolmnurk1xCoord.add(10);

        List<Integer> kolmnurk1yCoord = new ArrayList<>();
        kolmnurk1yCoord.add(2);
        kolmnurk1yCoord.add(5);
        kolmnurk1yCoord.add(1);

        Kolmnurk kolmnurk = new Kolmnurk(kolmnurk1xCoord, kolmnurk1yCoord);

        System.out.println(kolmnurk1xCoord);
        System.out.println(kolmnurk1yCoord);

        int ymberm66t = kolmnurk.lisaKoordinaadid(5,10);
        System.out.println(ymberm66t);
    }

}