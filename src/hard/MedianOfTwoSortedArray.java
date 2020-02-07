package hard;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        mergeArray(nums1, nums2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;

        if(nums1.length == 0){
            int mid = nums2.length / 2;
            if(nums2.length % 2 == 0) {
                return (nums2[mid]+nums2[mid-1])/2;
            } else {
                return nums2[mid];
            }
        }

        if(nums2.length == 0){
            int mid = nums1.length / 2;
            if(nums1.length % 2 == 0) {
                return (nums1[mid]+nums1[mid-1])/2;
            } else {
                return nums1[mid];
            }
        }
        return median;
    }

    private static void mergeArray(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int counter = 0;

        while (i<nums1.length-1 && j<nums2.length-1) {
            if(nums1[i]<nums2[j]) {
                newArray[counter] = nums1[i];
                i++;
            }else {
                newArray[counter] = nums2[j];
                j++;
            }
            counter++;
        }

        for(int x=j; x<nums2.length-1; x++) {
            newArray[counter] = nums2[j];
            counter++;
        }

        for(int x=i; x<nums1.length-1; x++) {
            newArray[counter] = nums1[j];
            counter++;
        }

        for(int num: newArray){
            System.out.print(num+", ");
        }
        System.out.println();


    }

}
