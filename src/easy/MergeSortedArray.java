package easy;




public class MergeSortedArray {

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2,5,6};
//        int m = 3;
//        int n = 3;

        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;



        merge(nums1, m, nums2, n);

        for(int num: nums1){
            System.out.print(num+", ");
        }
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//        Output: [1,2,2,3,5,6]

        for(int i=0; i<n; i++){
            int counter = m;
            int currentNumber = nums2[i];
            while (counter >= 1 && nums1[counter-1]>currentNumber){
                nums1[counter] = nums1[counter-1];
                counter--;
            }
            nums1[counter] = currentNumber;
            m++;
        }
    }

}
