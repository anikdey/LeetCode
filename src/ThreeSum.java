import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(getClosestNumber(nums, target));
    }

    public static int getClosestNumber(int[] nums, int targetNum) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int x= i+1;
            int j = nums.length - 1;
            while(x<j){
                int sum = nums[i] + nums[x] + nums[j];
                System.out.println(sum);
                x++;
                j--;
            }
        }
        return result;
    }

}
