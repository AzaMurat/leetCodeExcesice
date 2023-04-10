package removeElement;

public class Main {
    public static void main(String[] args) {
        int[] a = {2,3,3,2};
        int b = 3;
        System.out.println(removeElement(a, b));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}