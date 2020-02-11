package easy;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int uniqueLength = 0;
        if(nums.length>0){
            uniqueLength = 1;
            int prevNumber = nums[0];
            int lastIndex = 1;
            for(int i=1; i<nums.length; i++){
                if(nums[i]>prevNumber) {
                    prevNumber = nums[i];
                    nums[lastIndex] = prevNumber;
                    lastIndex++;
                    uniqueLength++;
                }
            }
        }
        return uniqueLength;
    }

}
