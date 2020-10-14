package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        sampleMetod();
    }

    public static void sampleMetod() {
        int age = 15;
        int temperature = 45;
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
            System.out.println(secondMetod(99 , -23)) ;
            System.out.println(secondMetod(99 , -23) + secondMetod( 98 , -22));
            System.out.println(concat("Сидите" , "Дома"));
        }
    }

    public static double secondMetod(double a, int b) {
        double result = a + b;
        return result;
    }
    public static String concat(String t1, String t2) {
        return t1 + " " + t2;}

}
