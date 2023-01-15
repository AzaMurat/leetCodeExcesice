package maximumValueOfAStringInAnArray;

public class Main {
    public static void main(String[] args) {

    }

    public static int maximumValue(String[] strs) {
        int logika = 0;
        for (String number : strs) {
            logika = Math.max(logika, simbol(number));
        }
        return logika;
    }

    private static int simbol(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                return s.length();
            }
        }
        return Integer.parseInt(s);
    }
}