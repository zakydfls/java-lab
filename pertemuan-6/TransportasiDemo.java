import transportasi.Bicycle;
import transportasi.Kendaraan;

public class TransportasiDemo {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan();
        Bicycle sepedaGunung = new Bicycle(2, "Sepeda Gunung", "ABC");

        mobil.warna = "ungu";
        mobil.merk = "tesla";
        mobil.roda = 4;
        mobil.infoKendaraan();
        mobil.berjalan("Depan");
        mobil.berhenti();
        mobil.kecepatan = 20;

        int gearSepedaGunung = sepedaGunung.gear + 3;

        System.out.println("kecepatan awal " + mobil.kecepatan);
        int kecepatan = mobil.kecepatanSekarang(10, "lambat");
        System.out.println("kecepatan kendaraan adalah " + kecepatan);
        mobil.mundur();
        System.out.println("kecepatan sekarang setelah mundur " + mobil.kecepatan);
        System.out.println("Gear sepeda gunung = " + gearSepedaGunung);
        sepedaGunung.ngerem();

    }
}
