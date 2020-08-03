package com.company.algorithms;

import java.util.Scanner;

public class RepeatedStrings {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }

    static long repeatedString(String s, long n) {
        long repeaterString = n / s.length();
        long croppedStringChartsCount = n - (s.length() * repeaterString);

        long repeaterCharts = 0L;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                repeaterCharts++;
        }

        repeaterCharts *= repeaterString;

        for (int i = 0; i < croppedStringChartsCount; i++) {
            if (s.charAt(i) == 'a')
                repeaterCharts++;
        }

        return repeaterCharts;
    }

}
