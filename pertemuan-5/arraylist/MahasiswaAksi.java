package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        char menu = 'Y';
        Scanner inp = new Scanner(System.in);
        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        // membuat input nama, nim, dan nilai
        while (menu == 'Y' || menu == 'y') {
            System.out.print("Masukkan nama mahasiswa                   : ");
            String nama = inp.nextLine();
            System.out.print("Masukkan NIM mahasiswa                    : ");
            String nim = inp.nextLine();
            ArrayList<Double> nilai = new ArrayList<Double>();
            System.out.print("Masukkan jumlah IPS yang ingin di Input   : ");
            int jml = inp.nextInt();
            inp.nextLine();
            for (int i = 1; i <= jml; i++) {
                System.out.print("Masukkan IP semester " + (0 + i) + " : ");
                String inputNilai = inp.nextLine();
                nilai.add(Double.parseDouble(inputNilai));
            }

            // membuat objek Mahasiswa dengan inputan yang telah dimasukkan
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim, nilai);

            // menambahkan data mahasiswa ke dalam ArrayList
            mahasiswaList.add(mahasiswa);

            // menampilkan data mahasiswa dan IPK menggunakan Iterator
            Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
            while (iterator.hasNext()) {
                Mahasiswa mhs = iterator.next();
                System.out.println("Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim() + ", IPK: " + mhs.hitungIPK());
            }
            System.out.print("Input data mahasiswa baru ? [Y/T] ");
            menu = inp.next().charAt(0);
            inp.nextLine();
        }
        inp.close();
    }
}
