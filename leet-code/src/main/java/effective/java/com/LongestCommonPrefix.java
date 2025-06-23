package effective.java.com;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i) {
                    if (currentChar != strs[j].charAt(i)) {
                        return strs[0].substring(0, i);
                    }
                } else {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}
