package Queues;

public class QueuesUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueuesUsingArray(){
        data = new int[5];
        front =-1;
        rear = -1;
    }
    public QueuesUsingArray(int capacity){
        data = new int[capacity];
        front =-1;
        rear = -1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public void enqueue(int elem){
        if (size == data.length){
            doubleCapacity();
//            System.out.println("queue is full");
//            return;
        }
        if (size == 0){
            front = 0;
        }
//        rear++;
//        if (rear == data.length){
//            rear = 0;
//        }
        rear = (rear + 1) % data.length;
        data[rear] = elem;
        size++;
    }

    private void doubleCapacity() {
        System.out.println("double capacity");
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        for(int i = front;i<temp.length;i++ ){
            data[index++] = temp[i];
        }
        for (int i = 0; i < front -1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public int front(){
        if (size == 0){
            return -1;
        }
        return front;
    }
    public int dequeue(){
        if (size == 0){
            System.out.println("queue is Empty");
            return -1;
        }
        int temp = data[front];
//        front++;
//        if (front == data.length){
//            front = 0;
//        }
        front = (front + 1) % data.length;
        size--;
        if (size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
