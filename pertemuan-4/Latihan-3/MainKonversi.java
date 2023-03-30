import java.util.Scanner;

public class MainKonversi {
    public static void main(String[] args) {
        int detik;
        char menu = 'Y';
        Scanner inp = new Scanner(System.in);

        KonversiDetik x = new KonversiDetik();
        do {
            System.out.print("Masukkan detik  :");
            detik = inp.nextInt();

            x.setData(detik);
            x.konversiMenit(detik);
            x.konversiJam(detik);
            x.konversiHari(detik);
            x.cetakData();

            System.out.println("Input data lagi ? [Y/T]");
            menu = inp.next().charAt(0);
            inp.nextLine();
        } while (menu == 'Y' || menu == 'y');
        inp.close();

    }
}
