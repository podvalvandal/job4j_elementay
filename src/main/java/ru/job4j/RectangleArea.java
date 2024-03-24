package ru.job4j;

public class RectangleArea {
    public static double square(double p, double k) {
        double alp = p / (2 * (k + 1));
        double bet = alp * k;
        double gam = bet * alp;
        return gam;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}
