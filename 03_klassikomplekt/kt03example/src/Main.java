//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Info info = new Info("Macbook", 16, "Intel");
        Arvuti arvuti = new Arvuti(info , 1000, "Kristiine");
        arvuti.muudaPoodi("Mustamäe");
        arvuti.info.muudaNimetus("Mac Pro");

        Arvuti arvuti2 = new Arvuti(new Info("Dell", 32, "Nvidia"),1100, "Ülemiste");
        arvuti2.paneAllahindlus(200);
    }
}