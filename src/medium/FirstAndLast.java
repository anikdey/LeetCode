package medium;

public class FirstAndLast {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] indices = searchRange(nums, 6);
        System.out.println(indices.toString());
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] indices = {-1, -1};
        boolean firstInstance = true;

        for(int i=0; i<nums.length; i++) {
            int currentNumber = nums[i];
            if(currentNumber == target) {
                if(firstInstance == true) {
                    firstInstance = false;
                    indices[0] = i;
                    indices[1] = i;
                } else {
                    indices[1] = i;
                }
            }else if (currentNumber>target){
                break;
            }
        }
        return indices;
    }

}
