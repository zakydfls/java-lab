package transportasi;

public class Bicycle {
    public int gear = 5;
    int roda;
    String jenisSepeda;
    String merkSepeda;

    public Bicycle(int jumlahRoda, String jenis, String merk) {
        roda = jumlahRoda;
        jenisSepeda = jenis;
        merkSepeda = merk;
        System.out.println("Sepeda: " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }

    // ini adalah tempat method
    public void ngerem() {
        System.out.println("Sepeda direm");
    }
}
