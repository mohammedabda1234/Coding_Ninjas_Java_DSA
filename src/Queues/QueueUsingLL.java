package Queues;
class Node<T>{
      T data;
      Node<T> next;
    Node(T data){
        this.data =data;
        next = null;
    }
}

public class QueueUsingLL <T>{
    private Node<T> front;
    private Node<T>rear;
    private int size;
    QueueUsingLL(){
        this.front =null;
        this.rear =null;
        this.size =0;
    }

    public int size(){
       return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void enqueue(T elem){
        Node<T> node = new Node<>(elem);
        size++;
        if (rear == null){
            front = node;
            rear = node;
        }else {
            rear.next = node;
            rear = node;//or rear = rear.next
        }
    }

    public T front(){
        if (front == null){
            System.out.println("Queue is Empty");
            return null;
        }
        return front.data;
    }
    public T dequeue(){
        if (front == null){
            System.out.println("Queue is Empty");
            return null;
        }
        T temp = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        size--;
        return temp;
    }

}
