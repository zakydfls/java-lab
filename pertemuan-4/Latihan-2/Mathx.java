public class Mathx {
    double d, b, a, c, xx, x;

    void setData(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void hitung() {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            x = (-b + Math.sqrt(d) / a * 2);
            xx = (-b - Math.sqrt(d) / a * 2);
            System.out.println("X1          : " + x);
            System.out.println("X2          : " + xx);
        } else if (d == 0) {
            x = (-b / 2 * a);
            xx = (-b / 2 * a);
            System.out.println("X1          : " + x);
            System.out.println("X2          : " + xx);
        } else {
            x = (-b / a * 2) + (Math.sqrt(-d) / 2 * a);
            xx = (-b / a * 2) - (Math.sqrt(-d) / 2 * a);
            System.out.println("X1          : " + x);
            System.out.println("X2          : " + xx);
        }
    }

    // double d_lebih(double a, double b, double c) {
    // x = (-b + Math.sqrt(d) / a * 2);
    // xx = (-b - Math.sqrt(d) / a * 2);
    // return x;
    // }

    // double d_sama(double a, double b, double c) {
    // x = (-b / 2 * a);
    // xx = (-b / 2 * a);
    // return x;
    // }

    // double d_kurang(double a, double b, double c) {
    // x = (-b / a * 2) + (Math.sqrt(-d) / 2 * a);
    // xx = (-b / a * 2) - (Math.sqrt(-d) / 2 * a);
    // return x;
    // }
}
