package leetcodestring;

public class strStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String temp = haystack.substring(i, i + needle.length());
            if (temp.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
        haystack = "aaaaa";
        needle = "bba";
        System.out.println(strStr(haystack, needle));
        haystack = "";
        needle = "";
        System.out.println(strStr(haystack, needle));
    }
}
