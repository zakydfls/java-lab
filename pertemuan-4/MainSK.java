import java.util.Scanner;

public class MainSK {
    public static void main(String[] args) {
        Boolean menu = true;
        StrukturKendali sk = new StrukturKendali();
        Scanner inp = new Scanner(System.in);
        do {
            sk.inputData();
            sk.cetakData();
            System.out.println("Input data lagi ? [Y/T]");
            String pil = inp.next();
            inp.nextLine();
            if (pil == "Y") {
                menu = true;
            } else {
                break;
            }
        } while (true);
    }
}
