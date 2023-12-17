package stack;

import java.util.Stack;

public class validateParentheses {
    static Boolean validParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '['){
                stack.push(']');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '('){
                stack.push(')');
            }
            else{
                if(stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "){";
        System.out.println(validParentheses(s));
    }
}