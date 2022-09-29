/**
 *BIL122-LAB02-AMMAR DASKÝN
 *<EMIRHAN SIMSEK> <20120205046> <emirhan.simsek20@gmail.com>
 *BU PROGRAM KULLANICIDAN ALINAN DENKLEMIN KOKLERINI BULMAYA YARAR
 *18.03.2021  21:28
 */
import java.util.Scanner;

public class Quadratic {
    double a, b, c;
    double x1, x2;



    public double getX1() {
        return x1;
    }

    public void setX1(double X1) {
        x1 = X1;

    }

    public double getX2() {
        return x2;
    }

    public void setX2(double X2) {
        x2 = X2;
    }

    public double getDiscriminant() {

        return b * b - 4 * a * c;
    }

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double d = getDiscriminant();
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        Quadratic q = new Quadratic(a, b, c);

        System.out.println("x1: " + q.getX1());
        System.out.println("x2: " + q.getX2());
    }
}