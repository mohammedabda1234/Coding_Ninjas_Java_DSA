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

    static boolean checkRedundancy(String expression) {
        // create a stack of characters
        Stack<Character> st = new Stack<>();
        char[] str = expression.toCharArray();
        // Iterate through the given expression
        for (char ch : str) {
            // if current character is close parenthesis ')'
            if (ch == ')') {
                char top = st.peek();
                st.pop();
                // If immediate pop have open parenthesis '('
                // duplicate brackets found
                boolean flag = true;
                while (top != '(') {
                    // Check for operators in expression
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = false;
                    }
                    // Fetch top element of stack
                    top = st.peek();
                    st.pop();
                }
                // If operators not found
                if (flag == true) {
                    return true;
                }
            } else {
                st.push(ch); // push open parenthesis '(',
            }                // operators and operands to stack
        }
        return false;
    }
    public static void main(String[] args) {
//        String s = "({[]})";
//        boolean re = isValid(s);
//        System.out.println(re);

        String s = "a+(b)+c \n";
        boolean re = checkRedundancy(s);
        System.out.println(re);
    }
}
