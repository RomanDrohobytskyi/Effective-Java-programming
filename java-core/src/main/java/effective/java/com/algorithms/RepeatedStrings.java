package effective.java.com.algorithms;

public class RepeatedStrings {

    public static long repeatedString(String s, long n) {
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
