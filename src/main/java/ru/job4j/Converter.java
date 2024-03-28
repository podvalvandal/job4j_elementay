package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        /*
        float input = 140;
        float expected = 2;
        float outpuE = Converter.rubleToEuro(input);
        float outputD = Converter.rubleToDollar(input);
        boolean passedE = expected == outpuE;
        boolean passedD = expected == outputD;
        System.out.println("140 rubles are 2 E. Test result : " + passedE);
        System.out.println("140 rubles are 2 D. Test result : " + passedD);
*/
         float euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " euro.");

    }

}
