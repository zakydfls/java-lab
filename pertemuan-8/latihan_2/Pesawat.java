package latihan_2;

public class Pesawat {
    int sayap, ekor;

    public Pesawat(int sayap, int ekor) {
        this.sayap = sayap;
        this.ekor = ekor;
        System.out.println("object Pesawat dibuat...");
    }

    public void terbang() {
        System.out.println("Pesawat diterbangkan...");
    }

    public void mendarat() {
        System.out.println("Pesawat mendarat...");
    }
}
