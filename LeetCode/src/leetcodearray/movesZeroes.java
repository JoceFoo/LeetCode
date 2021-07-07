package leetcodearray;

import java.util.ArrayList;
import java.util.List;

public class movesZeroes {

    public static void moveZeroes(int[] nums) {
        int[] nums2 = new int[nums.length];
        int length = 0;
        int count = 0;
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0) {
                nums2[length] = nums[i];
                length++;
            }
            if (nums[i] == 0) {
                count++;
            }
        }
        while (count-- > 0) {
            nums2[length] = 0;
            length++;
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[i]=nums2[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {0};
        moveZeroes(nums);
    }
}
