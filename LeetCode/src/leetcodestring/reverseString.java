package leetcodestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class reverseString {

    public static void reverseString(char[] s) {
        List<Character> list = new ArrayList<>();
        for (int i = s.length - 1; i >= 0; i--) {
            list.add(s[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            s[i] = list.get(i);
        }
//        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
    }
}
