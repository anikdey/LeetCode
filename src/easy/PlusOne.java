package easy;

public class PlusOne {

    public static void main(String[] args) {
        int[] nums = {9,9};
        plusOne(nums);
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1; i>=0; i--){
            int currentDigit = digits[i] + carry;
            if(currentDigit > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = currentDigit;
                return digits;
            }
        }
        if(carry == 1) {
            int[] results = new int[digits.length+1];
            results[0] = carry;

            for(int i=1; i<results.length; i++){
                results[i] = digits[i-1];
            }
            return results;
        }
        return digits;
    }

}
