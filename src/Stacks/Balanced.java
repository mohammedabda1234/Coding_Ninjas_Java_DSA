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

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {

        if(input.size()<=1)
        {
            return;
        }
        int temp = input.pop();
        reverseStack(input, extra);
        while(!input.isEmpty())
        {
            int z = input.pop();
            extra.push(z);
        }
        input.push(temp);
        while(!extra.isEmpty())
        {
            int k = extra.pop();
            input.push(k);
        }
    }
    public static void main(String[] args) {
        String s = "({[]})";
        boolean re = isValid(s);
        System.out.println(re);

    }
}
