package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDiv(double first, double second) {
        return minus(first, second)
                + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return minus(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат вычета равен: " + minusAndDiv(10, 20));
        System.out.println("Результат всей суммы равен: " + sumAll(10, 20));

    }
}