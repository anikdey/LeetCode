package easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        //String s = "leetcode";
        String s = "aadadaad";
        //return 0.

        //String s = "loveleetcode";
        //return 2.
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int length = s.length();
        if(length == 1)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<length-1; i++){
            int currentChar = s.charAt(i);
            innerLoop:
            for(int x=i+1; x<length; x++){
                if(currentChar == s.charAt(x)){
                    map.put(currentChar, currentChar);
                    break innerLoop;
                }
                if(currentChar != s.charAt(x) && x+1 == length && !map.containsKey(currentChar)){
                    return i;
                }
            }
        }
        return -1;
    }

}
