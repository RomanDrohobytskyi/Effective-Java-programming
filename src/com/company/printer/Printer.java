package com.company.printer;

public class Printer {

    public static void printStarsForLength(int length){
        StringBuilder stars = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            stars.append("*");
        }
        System.out.println(stars);
    }

}
