package latihan2;

public class KaryawanTetap extends Karyawan {

    int gajiPokok;

    public void setGaji(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int totGaji() {
        totalGaji = gajiPokok + tunjangan();
        return totalGaji;
    }

    public void cetak() {
        System.out.println("Nama Karyawan       : " + nama);
        System.out.println("Jumlah Anak         : " + jmlAnak);
        System.out.println("Jumlah Tunjangan    : " + tunjangan());
        System.out.println("Total Gaji          : " + totGaji());
    }

}
