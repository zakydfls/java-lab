import java.util.Scanner;

public class Penjualan {
    String nama, kode, bonus;
    double harga, total;
    int jml;
    Scanner inp = new Scanner(System.in);

    void setData(String kode, String nama, double harga, int jml) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jml = jml;
    }

    public double getTotalPembelian() {
        total = harga * jml;
        return total;
    }

    public String getBonus() {
        if (total >= 500000 & jml > 5) {
            bonus = "Setrika";
        } else if (total >= 100000 & jml > 3) {
            bonus = "Payung";
        } else if (total >= 50000 & jml > 2) {
            bonus = "Ballpoint";
        }
        return bonus;
    }

    void cetakNota() {
        System.out.println("==========NOTA PEMBELIAN==========");
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + nama);
        System.out.println("Harga barang : Rp." + harga);
        System.out.println("Jumlah barang : " + jml);
        System.out.println("Total harga : Rp." + total);
        System.out.println("Bonus : " + bonus);
    }
}
