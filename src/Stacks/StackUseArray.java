package Stacks;

public class StackUseArray {

    private int[] data;
    private int index;

    public StackUseArray(){
        data = new int[10];
        index = -1;
    }
    //O(1)
    public int size(){
        return index + 1;
    }
    //O(1)
    public boolean isEmpty(){
        return size() == 0;
    }
    //O(1)
    public void push(int elem){
        if (index == data.length -1){
            //throw error
            System.out.println("Stack is full");
        }
        data[++index] = elem;
    }
    //O(1)
    public int top(){
        if (index == -1){
            //throw error
            System.out.println("Stack is Empty");
        }
        return data[index];
    }
    //O(1)
    public int pop(){
        if (index == -1){
            //throw error
            System.out.println("Stack is Empty");
        }
        int temp = data[index];
        index--;
        return temp;
    }

}
