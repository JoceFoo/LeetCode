package leetcodearray;

public class ArrayRotation {

    /*Exceed Time Limit,Bruth force*/
//    public static void rotate(int[] nums, int k) {
//        
//        int checking = nums.length - 1;
//        while (k-- > 0) {
//            int a = nums[0];
//            nums[0] = nums[checking];
//            nums[checking] = a;
//            for (int i = 1; i < nums.length; i++) {
//                int b = nums[i];
//                nums[i] = nums[checking];
//                nums[checking] = b;
//            }
//        }
//    }
    /*Recursion*/
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 3;
        rotate(nums2, k2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("");

    }
}
