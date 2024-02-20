public class Arvuti {
    Info info; // klassikomplekt
    int maksmus;
    String pood;

    public Arvuti(Info info, int maksmus, String pood) {
        this.info = info;
        this.maksmus = maksmus;
        this.pood = pood;
    }

    public void muudaPoodi(String pood) {
        this.pood = pood;
    }

    public int paneAllahindlus(int allahindlus) {
        this.maksmus = this.maksmus - allahindlus;
        return this.maksmus;
    }
}
