package easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        //System.out.println(isValid("([]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("}"));
    }

    private static boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<length; i++){
            char currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }else if(currentChar == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }else if(currentChar == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            }else if( currentChar == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
