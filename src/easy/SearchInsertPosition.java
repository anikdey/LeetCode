package easy;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int result = searchInsert(nums, 0);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for(i=0; i<nums.length; i++) {
            if(nums[i]>=target) {
                return i;
            }
        }
        return i;
    }
}
