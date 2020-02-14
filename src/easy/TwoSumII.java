package easy;

public class TwoSumII {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] indices = twoSum(nums, target);
        System.out.print("");
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j = numbers.length-1;
        while (i<j){
            int total = numbers[i] + numbers[j];
            if(total == target){
                return new int[]{i+1, j+1};
            }else if(total<target){
                i++;
            }else if(total>target){
                j--;
            }
        }
        return null;
    }
}
