package latihan_2;

public class PesawatMain {
    public static void main(String[] args) {
        Pesawat pesawat1 = new Pesawat(2, 1);
        PesawatTempur pesawatTempur1 = new PesawatTempur(4, 2);

        System.out.println("======AIRBUS======");
        pesawat1.terbang();
        pesawat1.mendarat();
        System.out.println("=====F16======");
        pesawatTempur1.terbang();
        pesawatTempur1.mendarat();
        pesawatTempur1.manuver();

    }
}
