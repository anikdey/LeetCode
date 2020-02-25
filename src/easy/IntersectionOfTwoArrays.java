package easy;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        printArray(intersection(nums1, nums2));
    }

    private static void printArray(int[] arr) {
        for(int item: arr){
            System.out.print(item+", ");
        }
        System.out.println();
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int outer=0; outer<nums1.length; outer++){
            for(int inner=0; inner<nums2.length; inner++){
                if(nums1[outer] == nums2[inner] && !map.containsKey(nums1[outer])){
                    map.put(nums1[outer], nums1[outer]);
                }
            }
        }

        int[] result = new int[map.size()];
        int counter = 0;
        for(int value : map.values()){
            result[counter] = value;
            counter++;
        }
        return result;
    }

}
