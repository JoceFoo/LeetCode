package leetcodestring;

import java.util.HashMap;

public class FirstUniqueCharacterinaStringSolution {

    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> list=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char temp=s.charAt(i);
            list.put(temp, list.getOrDefault(temp, 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (list.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(firstUniqChar(s));
        s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
