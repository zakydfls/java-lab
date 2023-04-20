package latihan1;

public class Mobil2 {

    int gigiMobil = 0;

    void hidupkanMobil() {
        System.out.println("Mobil dihidupkan...");
    }

    void matikanMobil() {
        System.out.println("Mobil dimatikan...");
    }
    // public int ubahGigi(String gigi){
    // return gigi;
    // }

    void ubahGigi(String gigi) {
        if (gigi == "+") {
            gigiMobil += 1;
            System.out.println("Gigi mobil sekarang : " + gigiMobil);
        } else if (gigi == "-") {
            if (gigiMobil == 0) {
                System.out.println("Beralih ke Gigi R (Mundur)");
            } else {
                gigiMobil -= 1;
                System.out.println("Gigi mobil sekarang : " + gigiMobil);
            }
        }
    }
}
