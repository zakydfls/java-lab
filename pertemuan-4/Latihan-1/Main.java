import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama, kode;
        double harga;
        char i = 'Y';
        int jml;
        Scanner inp = new Scanner(System.in);
        Penjualan jual = new Penjualan();
        do {
            System.out.print("Masukkan kode barang : ");
            kode = inp.nextLine();
            System.out.print("Masukkan nama barang : ");
            nama = inp.nextLine();
            System.out.print("Masukkan harga barang : ");
            harga = inp.nextDouble();
            System.out.print("Masukkan jumlah barang : ");
            jml = inp.nextInt();

            jual.setData(kode, nama, harga, jml);
            jual.getTotalPembelian();
            jual.getBonus();
            jual.cetakNota();

            System.out.println("Input data lagi ? [Y/T]");
            i = inp.next().charAt(0);
            inp.nextLine();
        } while (i == 'Y' || i == 'y');
        inp.close();
    }
}
