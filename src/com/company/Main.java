package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        something();
        sampleMetod(15, 25);
        sampleMetod(45 , -5);
        sampleMetod(20 , -45);
        sampleMetod( 37, 58);
    }
    public static void something (){
        int temperatura = 17;
        int personAge = 36;
        System.out.println(temperatura  +" " +personAge);
    }


    public static void sampleMetod(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }

}
