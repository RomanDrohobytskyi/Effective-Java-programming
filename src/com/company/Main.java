package com.company;

import com.company.menu.Menu;

public class Main {

    /*
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
     */
    public static void main(String[] args) {
        new Menu().menu();
    }
}
