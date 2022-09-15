package Stacks;

public class StackUse {
    public static void main(String[] args) {
//        StackUseArray stack = new StackUseArray();
        StackUseLL<Integer> stack = new StackUseLL<>();
//        int[] nums = {3,5,6,8,9,};
//        for (int i = 0; i < nums.length; i++) {
//            stack.push(nums[i]);
//        }
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        System.out.println(stack.isEmpty());
        int[] nums = {3,5,6,8,9,};
        for (int i = 0; i < nums.length; i++) {
            stack.push(nums[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

//        stack.push(10);
//        System.out.println(stack.top());
//        stack.pop();
//        stack.size();
//        System.out.println(stack.isEmpty());
//        stack.pop();
    }
}
