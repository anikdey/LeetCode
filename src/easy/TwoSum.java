package easy;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int expected = target - nums[i];
            if(map.containsKey(expected)){
                indices[0] = map.get(expected);
                indices[1] = i;
                break;
            }else {
                map.put(nums[i], i);
            }
        }
        return indices;
    }
}
