package leetcodearray;

import java.util.ArrayList;
import java.util.List;

public class plusOne {

    public static int[] plusOne(int[] digits) {
//        List<Integer> list = new ArrayList<>();
//
//        if (digits.length == 0) {
//            return digits;
//        }
//        for (int i = 0; i < digits.length; i++) {
//            if (digits[i] != 9) {
//                if (i == digits.length - 1) {
//                    list.add(digits[i] + 1);
//                } else {
//                    list.add(digits[i]);
//                }
//            }
//            if (digits[i] == 9) {
//                if (i == digits.length - 1) {
//                    if (digits.length==1) {
//                        list.add(1);
//                        list.add(0);
//                    }else if (digits[i - 1] != 9) {
//                        list.add(1);
//                        list.add(0);
//                    } else {
//                        list.add(0);
//                    }
//
//                } else {
//                    list.add(1);
//                    list.add(0);
//                }
//            }
//        }
//        int[] result = new int[list.size()];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = list.get(i);
//        }
//        return result;
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {0};
        int[] digits4 = {9, 9};
        for (int a : plusOne(digits)) {
            System.out.print(a + " ");
        }
        System.out.println("");

        for (int a : plusOne(digits2)) {
            System.out.print(a + " ");
        }
        System.out.println("");

        for (int a : plusOne(digits3)) {
            System.out.print(a + " ");
        }
        System.out.println("");

        for (int a : plusOne(digits4)) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}
