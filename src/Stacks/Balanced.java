package Stacks;

import java.util.Stack;

public class Balanced {
    public static boolean isValid (String expression){
        Stack<Character>stack = new Stack<>();
        for (char c:expression.toCharArray()){
            if (c == '('||c == '{'|| c == '['){
                stack.push(c);
            }else if (stack.isEmpty()){
                return false;
            }else {
                char top = stack.peek();
                if ((c == ')'&& top == '(')||
                 (c == '}'&& top == '{')||
                 (c == ']'&& top == '[')){
                    stack.pop();
                }else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[]})";
        boolean re = isValid(s);
        System.out.println(re);
    }
}
