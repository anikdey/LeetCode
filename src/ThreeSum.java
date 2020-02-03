import java.util.HashMap;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(getClosestNumber(nums, target));
    }

    public static int getClosestNumber(int[] nums, int targetNum) {
        int result = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length-2; i++){
            int sum = nums[i] + nums[i+1] + nums[i+2];
            System.out.println(sum);
            if(sum<result) {
                result = sum;
            }
        }
        return result;
    }

}
