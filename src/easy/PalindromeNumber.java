package easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindromeBetterApproach(10));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindromeBetterApproach(1221));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(010));

        //isPalindrome(-121);
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum = 0;
        int copy = x;
        while (copy != 0) {
            int rem = copy % 10;
            sum = sum * 10 + rem;
            copy /= 10;
        }
        return sum == x;
    }


    public static boolean isPalindromeBetterApproach(int x) {
        if(x<0){
            return false;
        }
        int revertedNumber = 0;
        while (x>revertedNumber){
            revertedNumber = revertedNumber * 10 + x%10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }


}
