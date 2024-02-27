import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("valjund.txt"));
        pw.print("Elas");
        pw.print(" ");
        pw.print("metsas");
        pw.print(" ");
        pw.print("mutionu");
        pw.println();
        pw.println("keset kuuski noori vanu");
        pw.println("elu ruum tal sügaval");
        pw.close();
    }
}