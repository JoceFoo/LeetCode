package leetcodearray;

import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber2(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }

    public static int singleNumber(int[] nums) {
        int temp = nums[0];
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0 && nums[i] != nums[i + 1]) {
                temp = nums[i];
                break;
            }
            if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                temp = nums[i];
                break;
            }
            if (i == nums.length - 2 && nums[i] != nums[i + 1]) {
                temp = nums[i + 1];
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int[] nums2 = {2, 2, 1};
        int[] nums3 = {1};
        System.out.println(singleNumber(nums3));
        System.out.println(singleNumber2(nums3));
    }
}
