public class Mathx {
    double d, b, a, c, xx, x;

    void setData(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double d_lebih(double a, double b, double c) {
        x = (-b + Math.sqrt(d) / a * 2);
        xx = (-b - Math.sqrt(d) / a * 2);
        return x;
    }
}
