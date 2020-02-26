package easy;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (n != 1){
            int sum = 0;
            while (n != 0) {
                int remainder = n % 10;
                sum += (remainder*remainder);
                n = n/10;
            }
            n = sum;
            if(map.containsKey(sum)){
                return false;
            }
            map.put(sum, sum);
        }
        return true;
    }

}
