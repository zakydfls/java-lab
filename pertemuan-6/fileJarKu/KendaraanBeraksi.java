public class KendaraanBeraksi {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        Kendaraan motor = new Kendaraan();
        Kendaraan sepeda = new Kendaraan();

        motor.warna = "Hitam";
        motor.merk = "Yamamoto";
        motor.roda = 2;
        motor.infoKendaraan();
        mobil.warna = "ungu";
        mobil.merk = "tesla";
        mobil.roda = 4;
        mobil.infoKendaraan();
        mobil.berjalan("Depan");
        mobil.berhenti();
        mobil.kecepatan = 20;
        sepeda.kecepatan = 5;
        System.out.println("kecepatan awal " + mobil.kecepatan);
        int kecepatan = mobil.kecepatanSekarang(10, "lambat");
        System.out.println("kecepatan kendaraan adalah " + kecepatan);
        mobil.mundur();
        System.out.println("kecepatan sekarang setelah mundur " + mobil.kecepatan);
    }
}
