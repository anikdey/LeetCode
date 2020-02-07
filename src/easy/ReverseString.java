package easy;

public class ReverseString {

    public static void main(String[] args) {
        char[] input = {'h','e','l','l','o'};
        System.out.println("Before reversing "+ new String(input));
        reverseString(input);
        System.out.println("After reversing "+ new String(input));
    }

    public static void reverseString(char[] s) {
        int length = s.length-1;
        int counter = 0;
        while (counter<length) {
            char temp = s[counter];
            s[counter] = s[length];
            s[length] = temp;
            counter++;
            length--;
        }
    }

}
