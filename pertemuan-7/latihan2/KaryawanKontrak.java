package latihan2;

public class KaryawanKontrak extends Karyawan {

    int hariMasuk;

    public void setHari(int hariMasuk) {

        this.hariMasuk = hariMasuk;
    }

    public int totGaji() {
        int upah = 30000;
        totalGaji = upah * hariMasuk + tunjangan();
        return totalGaji;
    }

    public void cetak() {
        System.out.println("Nama Karyawan       : " + nama);
        System.out.println("Jumlah Anak         : " + jmlAnak);
        System.out.println("Jumlah Tunjangan    : " + tunjangan());
        System.out.println("Total Gaji          : " + totGaji());
    }

}
