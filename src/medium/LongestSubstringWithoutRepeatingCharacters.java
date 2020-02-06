package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int target = Integer.MIN_VALUE;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int counter = 0;
        for(int i=0; i<length; i++){
            Character currentChar = s.charAt(i);
            if(map.containsKey(currentChar)){
                if(counter>target){
                    target = counter;
                }
                map.clear();
                map.put(currentChar, 0);
                counter = 1;
            } else {
                counter++;
                map.put(currentChar, 0);
            }
        }
        if(target == Integer.MIN_VALUE){
            return length;
        }
        return target;
    }
}
