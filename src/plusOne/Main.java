package plusOne;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] as = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,9};
        System.out.println(Arrays.toString(plusOne(as)));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0]==0){
            int[]arr = new int[digits.length+1];
            arr[0]=1;
            return arr;
        }
            return digits;
    }
}
