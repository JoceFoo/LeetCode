package leetcodearray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return nums2;
        }
        if (nums2.length == 0) {
            return nums1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                int freq = map.get(num);
                freq--;
                map.put(num, freq);
            }
        }

        return listToArray(result);

    }

    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        intersect(num, num2);
    }
}
