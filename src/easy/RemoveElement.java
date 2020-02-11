package easy;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));

    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int lastIndex = 0;
        int counter = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val){
                continue;
            }else {
                nums[lastIndex] = nums[i];
                lastIndex++;
                counter++;
            }
        }
        return counter;
    }

}
