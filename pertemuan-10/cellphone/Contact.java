package cellphone;

public class Contact extends Cellphone {
    String nama;
    String nomor;

    public Contact(String merk, String type) {
        super(merk, type);
    }

    public void tambahKontak(String nama, String nomor) {
        if (status == 1) {
            daftarKontak.put(nama, nomor);
            System.out.println("Kontak berhasil ditambahkan");
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi tambah kontak.");
        }
    }

    public void lihatSemuaKontak() {
        if (status == 1) {
            if (daftarKontak.isEmpty()) {
                System.out.println("Tidak ada kontak yang tersimpan");
            } else {
                System.out.println("Daftar Kontak:");
                for (String nama : daftarKontak.keySet()) {
                    String nomor = daftarKontak.get(nama);
                    System.out.println("Nama: " + nama + ", Nomor: " + nomor);
                }
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi lihat semua kontak.");
        }
    }

    public void cariKontak(String nama) {
        if (status == 1) {
            if (daftarKontak.containsKey(nama)) {
                String nomor = daftarKontak.get(nama);
                System.out.println("Nama: " + nama + ", Nomor: " + nomor);
            } else {
                System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi cari kontak.");
        }
    }

    // String getNama() {
    // return this.nama;
    // }

    // String getNomor() {
    // return this.nomor;
    // }

}