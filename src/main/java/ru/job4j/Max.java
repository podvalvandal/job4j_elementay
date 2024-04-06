package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        boolean can = right >= left;
        int dis = can ? right : left;
        return dis;
    }

    public static void main(String[] args) {
        int labeli = Max.max(33, 22);
        System.out.println(labeli);
    }
}
