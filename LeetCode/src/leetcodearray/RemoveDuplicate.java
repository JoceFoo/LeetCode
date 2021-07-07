package leetcodearray;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[temp]) {
                temp++;
                nums[temp] = nums[i];
            }
        }
        return temp + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println(k);
    }
}
