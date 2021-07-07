package leetcodearray;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        if (nums.length == 0) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 5};
        int target = 9;
        for (int i : twoSum(nums, target)) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] nums2 = {3, 2, 4};
        target = 6;
        for (int i : twoSum(nums2, target)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
