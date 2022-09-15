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
    public static int[] stockSpan(int[] price) {
        Stack<Integer> stk = new Stack<>();
        int n = price.length;
        int[] output = new int[n];
        stk.push(0);
        output[0] = 1;
        for (int i = 1; i < n; ++i) {
            while (!stk.isEmpty() && price[stk.peek()] < price[i]) {
                stk.pop();
            }
            if (stk.isEmpty()) {
                output[i] = i + 1;
            } else {
                output[i] = i - stk.peek();
            }
            stk.push(i);
        }
        return output;
    }

    static int countBracketReversals(String input)
    {
        // Step 1: Initialize a stack of char type and ans as 0.
        Stack<Character> st = new Stack<Character>();
        int ans = 0;

        // Step 2: Run a loop for each character of the string
        for (int i = 0; i < input.length(); i++) {

            // Step 2.1: If ' { ' encountered push it to the
            // stack
            if (input.charAt(i) == '{')
                st.add(input.charAt(i));
                // Step 2.2: If ' } ' is encountered
            else {
                // Step 2.2.1: If stack has a '{' present for
                // '}' encountered, pop from the stack.
                if (!st.isEmpty())
                    st.pop();

                    // Step 2.2.2: If stack is empty, change '}' to
                    // '{' and push it to stack and increment ans by
                    // 1
                else {
                    st.add('{');
                    ans++;
                }
            }
        }
        // Step 3: if stack size is odd return -1.
        if (st.size() % 2 != 0)
            return -1;
        // Step 4: Increment ans by ( stackSize/2 ).
        ans += st.size() / 2;

        return ans;
    }
    public static void main(String[] args) {
//        String s = "({[]})";
//        boolean re = isValid(s);
//        System.out.println(re);

//        String s = "a+(b)+c \n";
//        boolean re = checkRedundancy(s);
//        System.out.println(re);
        String str = "[{{()}}]";
        int re = countBracketReversals(str);
        System.out.println(re);
    }
}
