package Stacks;

public class StackUseArray {

    private int[] data;
    private int index;

    public StackUseArray(){
        data = new int[2];
        index = -1;
    }
    public StackUseArray(int size){
        data = new int[size];
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
//            System.out.println("Stack is full");
            doubleCapacity();
        }
        data[++index] = elem;
    }

    private void doubleCapacity() {
        System.out.println("double capacity");
        int[] temp = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
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
