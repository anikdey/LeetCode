package easy;

public class ReverseInteger {

    public static void main(String[] args) {
        //int number = reverse(123);
        //int number = reverse(120);
        //int number = reverse(-10);
        int number = reverse(1534236469); // output = 1534236469 , expected = 0

        System.out.println(number);
    }

    public static int reverse(int x) {
        double sum = 0;
        while (x != 0){
            int remainder = x%10;
            sum = sum * 10 + remainder;
            x = x/10;
        }
        if(sum >= -2147483648 && sum <= 2147483647){
            return (int)sum;
        }
        return 0;
    }
}
