import java.util.Scanner;

public class MathOut {
    public static void main(String[] args) {
        double d, b, a, c, xx, x;
        char menu = 'Y';

        Scanner inp = new Scanner(System.in);
        Mathx math = new Mathx();
        while (menu == 'Y' || menu == 'y') {
            System.out.print("Masukkan nilai a    : ");
            a = inp.nextDouble();
            System.out.print("Masukkan nilai b    : ");
            b = inp.nextDouble();
            System.out.print("Masukkan nilai c    : ");
            c = inp.nextDouble();

            math.setData(a, b, c);
            math.hitung();
            System.out.println("Input data lagi ? [Y/T] ");
            menu = inp.next().charAt(0);
        }

    }
}
