package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        //int[] nums = {1,3,4,2,2};
        int[] nums = {3,1,9,3,7,2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        //return twoPointer(nums);
        //return approach2(nums);
        return usingMap(nums);
    }

    private static int usingMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i], nums[i]);
        }
        return 0;
    }

    private static int approach2(int[] nums) {
        Arrays.sort(nums);
        int  i=0;
        while (i<nums.length-1){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
            i += 1;
        }
        return 0;
    }

    private static int twoPointer(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int from = i+1;
            int to = nums.length-1;
            while (from<=to){
                if(nums[from] == nums[i]){
                    return nums[i];
                }else if(nums[to] == nums[i]){
                    return nums[i];
                }
                from++;
                to--;
            }
        }
        return 0;
    }

}
