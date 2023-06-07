package latihan_2;

public class PesawatTempur extends Pesawat {

    public PesawatTempur(int sayap, int ekor) {
        super(sayap, ekor);
        System.out.println("objec Pesawat Tempur dibuat...");
    }

    public void manuver() {
        System.out.println("Pesawat oleng dikit, manuver kecepatan diturunkan...");
    }

    public void terbang() {
        super.terbang();
        System.out.println("Pesawat terbang ala tempur...");
    }
}
