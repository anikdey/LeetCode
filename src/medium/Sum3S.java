package medium;

import java.util.*;

public class Sum3S {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        //int[] threeSumArray = {-1, 0, 1, 2, -1, -4};
        int[] threeSumArray = { 0, 0, 0, 0, 0};
        //int[] threeSumArray = { -1, 0, 1, 0};
        int target = 9;
        //int[] indices = twoSum(nums, target);
        //System.out.println(indices.toString());
        System.out.println(threeSum(threeSumArray));
    }


    // It took 139 ms and 46 mb (Not optimum)
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            int sum = nums[i];
            int x = i+1;
            int j = nums.length-1;
            while (x<j) {
                int total = sum + nums[x]+nums[j];
                if(total == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[x]);
                    list.add(nums[j]);
                    result.add(list);
                    x++;
                    j--;
                }  else if(total<0) {
                    x++;
                }else if(total>0) {
                    j--;
                }
            }
            if(nums[i] != nums[i+1]){ }
        }
        return new ArrayList<>(result);
    }

}
