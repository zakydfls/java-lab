package latihan2;

import java.util.Scanner;

public class KaryawanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========Selamat datang di program gaji karyawan==========");
        System.out.print("Masukkan nama karyawan : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan jumlah anak : ");
        int jmlAnak = sc.nextInt();
        System.out.print("Pilih jenis karyawan : \n1. Karyawan tetap\n2. Karyawan Kontrak \n");
        int jenis = sc.nextInt();
        try {
            if (jenis == 1) {
                KaryawanTetap tetap = new KaryawanTetap();
                tetap.setData(nama, jmlAnak);
                System.out.println("Masukkan gaji pokok : ");
                int gaji = sc.nextInt();
                tetap.setGaji(gaji);
                tetap.cetak();
            } else if (jenis == 2) {
                KaryawanKontrak kontrak = new KaryawanKontrak();
                kontrak.setData(nama, jmlAnak);
                System.out.println("Masukkan jumlah hari masuk : ");
                int hari = sc.nextInt();
                kontrak.setHari(hari);
                kontrak.cetak();
            }
        } catch (Exception e) {
            System.out.println("Input yang anda masukkan diluar nalar");
        }
        sc.close();
    }
}
