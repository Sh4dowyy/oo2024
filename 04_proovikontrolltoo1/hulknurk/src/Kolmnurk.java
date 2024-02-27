import java.util.List;

public class Kolmnurk {
    List<Integer> xCoord;
    List<Integer> yCoord;

    public Kolmnurk(List<Integer> xCoord, List<Integer> yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int lisaKoordinaadid(int newXCoord, int newYCoord) {
        xCoord.add(newXCoord);
        yCoord.add(newYCoord);

        int summa = 0;
        for (int x: xCoord) {
            summa += x;
        }
        return summa;
    }
}
