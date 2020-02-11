package medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));
        //System.out.println(lengthOfLongestSubstring("sdfabdcsfab"));
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
                start = map.get(currentChar) + 1;
            }
            map.put(currentChar, i);
            int windowLength = i - start;
            //if(map.size()>)

        }
        return max;
    }

}
