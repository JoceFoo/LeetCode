package leetcodestring;

public class validPalindrome {

    public static boolean isPalindrome(String s) {
      int left=0;
      int right=s.length()-1;
      char leftchar,rightchar;
      while(left<=right){
          leftchar=s.charAt(left);
          rightchar=s.charAt(right);
          if (!Character.isLetterOrDigit(leftchar)) {
              left++;
          }else if(!Character.isLetterOrDigit(rightchar)){
              right--;
          }else{
              if (Character.toLowerCase(leftchar)!=Character.toLowerCase(rightchar)) {
                  return false;
              }
              left++;
              right--;
          }
      }
      return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        s = "race a car";
        System.out.println(isPalindrome(s));
        s = "0P";
        System.out.println(isPalindrome(s));
        s = "1B1";
        System.out.println(isPalindrome(s));
        s = "a.";
        System.out.println(isPalindrome(s));
        s = " ";
        System.out.println(isPalindrome(s));
    }
}
