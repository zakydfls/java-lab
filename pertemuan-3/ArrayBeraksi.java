import java.util.Scanner;

public class ArrayBeraksi {
    public static void main(String[] args) {
        int jmlData;
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        jmlData = inp.nextInt();

        ArrayPrototype ap = new ArrayPrototype();

        ap.setArray(jmlData);
        ap.cetakArray();

        System.out.println("\nJumlah angka = " +ap.sumOfArray());
    }
}
