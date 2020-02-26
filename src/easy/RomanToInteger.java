package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int number = 0;
        int limit = s.length();
        for(int i=0; i<limit; i++) {
            char ch = s.charAt(i);
            if(ch == 'I'){
                if(i+1<limit && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                    number -= 1;
                }else {
                    number += 1;
                }
            } else if(ch == 'V') {
                number += 5;
            } else if(ch == 'X') {
                if(i+1<limit && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                    number -= 10;
                }else {
                    number += 10;
                }
            } else if(ch == 'L') {
                number += 50;
            } else if(ch == 'C') {
                if(i+1<limit && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                    number -= 100;
                }else {
                    number += 100;
                }
            } else if(ch == 'D') {
                number += 500;
            } else if(ch == 'M') {
                number += 1000;
            }
        }
        return number;
    }
}
