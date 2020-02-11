package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("fgabcabcbb"));
        System.out.println(lengthOfLongestSubstring("sdfabdcsfab"));
        System.out.println(lengthOfLongestSubstring("sdfabdcsfag"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    private static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int start = 0;
        int max =  0;

        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<length; i++) {
            Character currentChar = s.charAt(i);
            if(map.containsKey(currentChar)){
                int index = map.get(currentChar) + 1;
                //start = map.get(currentChar) + 1;
                if(start<index){
                    start = index;
                }
            }
            int windowLength = i - start + 1;
            max = Math.max(max, windowLength);
            map.put(currentChar, i);
        }
        return max;
    }


}
