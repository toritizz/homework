package com.company;

public class Main {

    public static void main(String[] args) {
        String somestring;
        final int NUM = 12;
        String word = "someword";
        somestring = word + NUM;
        System.out.println(NUM + " " + word + " " + somestring);
        if (NUM < 0 ) {
            System.out.println( "Вы сохранили отрицательное число");
        } else if (NUM > 0){
            System.out.println( "Вы сохранили положительнон число");
        } else if (NUM == 0){
            System.out.println( "Вы сохранили нуль");
        }
    }
}
