package Stacks;

public class StackUseLL<T>{
    private Node<T> head;
    private int size;
//    public StackUseLL(){
//        head =null;
//        size = 0;
//    }
    private class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data =data;
            this.next = null;
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public void push(T elem){
        Node<T> node= new Node<>(elem);
        node.next = head;
        head = node;
        size++;
    }
    public T pop(){
        if (head == null){
            //throw error exceptions
            System.out.println("Stack is Empty");
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public T top(){
        if (head == null){
            //throw error exceptions
            System.out.println("Stack is Empty");
        }
        return head.data;
    }

}
