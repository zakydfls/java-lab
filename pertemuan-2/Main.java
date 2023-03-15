class Lampu {
    boolean nyala;
    void nyalakanLampu(){
        nyala = true;
        System.out.println("Apakah lampu menyala ? " + nyala );
    }
    void matikanLampu(){
        nyala = false;
        System.out.println("Apakah lampu menyala ? " + nyala );
    }
}
public class Main{
    public static void main(String[] args) {
        Lampu lampuNyala = new Lampu();
        lampuNyala.nyalakanLampu();
    }
}
