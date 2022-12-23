package polindrom;

public class Main {
    public static void main(String[] args) {
         System.out.println(isPalindrome(122));
    }
        public static boolean isPalindrome(int x) {
            if (x >= 0) {
                int a = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
                return a == x;
            } else
                return false;
        }
}