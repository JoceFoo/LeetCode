package leetcodearray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hasDuplicate {

    /*Time Limit Exceed*/
//    public static boolean containsDuplicate(int[] nums) {
//        boolean check = false;
//        if (nums.length == 0) {
//            return false;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==nums[j]) {
//                    check=true;
//                    break;
//                }
//            }
//        }
//        return check;
//    }
    /*Sort and compare*/
    public static boolean containsDuplicate(int[] nums) {
        boolean check = false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));

    }
}
