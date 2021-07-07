package leetcodestring;

public class reverseInteger {

    public static int reverse(int x) {

        int reverse = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            reverse = reverse * 10 + temp;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483412));
    }
}
