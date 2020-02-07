package easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("abcfcba"));
    }


    private static boolean isValidPalindrome(String s) {
        int length = s.length()-1;
        int counter = 0;
        while (counter<length){
            if(s.charAt(counter) != s.charAt(length))
                return false;
            counter++;
            length--;
        }
        return true;
    }


}
