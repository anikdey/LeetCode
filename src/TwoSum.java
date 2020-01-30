import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] threeSumArray = {-1, 0, 1, 2, -1, -4};
        int target = 9;
        //int[] indices = twoSum(nums, target);
        //System.out.println(indices.toString());
        System.out.println(threeSum(threeSumArray));
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

    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++) {
            int total = nums[i] + nums[i+1];
            int requiredSum = 0 - total;
            if(map.containsKey(requiredSum)){

                for(List<Integer> list: mainList){

                }


                List<Integer> list = new ArrayList<>();
                list.add(map.get(requiredSum));
                list.add(nums[i]);
                list.add(nums[i+1]);
                mainList.add(list);
            }
            map.put(nums[i], nums[i]);
        }
        return mainList;
    }
}
