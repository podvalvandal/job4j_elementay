package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double frd = Math.pow(x2 - x1, 2);
        double frds = Math.pow(y2 - y1, 2);
        double six = frd + frds;
        double ten = Math.sqrt(six);
        return ten;
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 0, 7, 0);
        System.out.println("result (7, 6) to (2, 3) " + result);
    }
}