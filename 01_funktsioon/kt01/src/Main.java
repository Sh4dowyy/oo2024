//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public String myVariable1, myVariable2;
//    public Main(String var1, String var2) {
//        this.myVariable1 = var1;
//        this.myVariable2 = var2;
    public static void main(String[] args) {
        //Main main = new Main("Hello", "Hi");
        //System.out.println(main.myVariable1 + main.myVariable2);

        System.out.println(tagastabInt(true));
        System.out.println(tagastabInt(false));

        tagastabVoid(true, 12);
        tagastabVoid(false, -3);

        System.out.println(tagastabString("tere"));
        System.out.println(tagastabString("tErE"));
    }

    public static Integer tagastabInt(boolean bool) {
        if (bool) {
            return 10;
        }
        return 20;
    }

    public static void tagastabVoid(boolean bool, int arv) {
        System.out.printf("Sinu parameetrid on %b ja %d%n", bool, arv);
        //System.out.println("Sinu parameetrid on " + bool + " ja " + arv);
    }

    public static String tagastabString(String sona) {
        return sona.toUpperCase();
    }

}