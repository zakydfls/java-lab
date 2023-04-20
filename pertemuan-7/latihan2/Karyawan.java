package latihan2;

public class Karyawan {
    String nama;
    int jmlAnak;
    int totalGaji, tunjangan;

    public void setData(String nama, int jmlAnak) {
        this.jmlAnak = jmlAnak;
        this.nama = nama;
    }

    public int tunjangan() {
        tunjangan = 150000 * jmlAnak;
        return tunjangan;
    }
}
