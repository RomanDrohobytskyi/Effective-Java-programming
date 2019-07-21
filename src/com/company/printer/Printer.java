package com.company.printer;

public class Printer {

    public static void printStarsForLenght(int lenght){
        StringBuilder stars = new StringBuilder("");
        for (int i = 0; i < lenght; i++) {
            stars.append("*");
        }
        System.out.println(stars);
    }

}
