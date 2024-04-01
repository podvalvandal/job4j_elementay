package ru.job4j;

public class Fit {
    public static double manWeight(double height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(double height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 180;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 180 is " + man);
        System.out.println("Woman 180 is " + woman);
    }
}
