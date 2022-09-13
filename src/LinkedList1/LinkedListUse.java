package LinkedList1;

import java.util.Scanner;

public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
//        System.out.println("n1 "+n1+" data "+ n1.data+" next "+n1.next);
        n2.next = n3;
//        System.out.println("n2 "+n2+" data "+ n2.data+" next "+n2.next);
        n3.next = n4;
//        System.out.println("n3 "+n3+" data "+ n3.data+" next "+n3.next);
//        System.out.println("n4 "+n4+" data "+ n4.data+" next "+n4.next);
        return  n1;
    }
    public static void print(Node<Integer>head){
//        System.out.println("print "+head);
        while (head !=null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();
//        System.out.println(head.next);
//        System.out.println(head.next.data);
    }
    public static void increment(Node<Integer>head){
        Node<Integer> temp = head;
        while (temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static int length(Node<Integer>head){
        Node<Integer>temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp =temp.next;
        }
        return count;
    }
    public static void printIthNode(Node<Integer> head, int i){
        Node<Integer> temp = head;
        int count = 0;
        if(temp==null)
        {
            return;
        }
        while(temp!=null)
        {
            if(count==i)
            {
                System.out.println(temp.data);
            }
            count++;
            temp=temp.next;
        }
    }
    public static Node<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null,tail = null;
        while (data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if (head == null){
                head = currentNode;
                tail = currentNode;
            }else {
//                Node<Integer> tail = head;
//                while (tail.next != null){
//                    tail = tail.next;
//                }
                tail.next = currentNode;
                tail = currentNode;
            }
            data  = s.nextInt();
        }
        return  head;
    }
    public static Node<Integer>insert(Node<Integer>head,int elem,int pos){
        Node<Integer> node = new Node<>(elem);
        if (pos == 0){
            node.next = head;
            return node;
        }else {
            int count = 0;
            Node<Integer> perv = head;
            while (count < pos - 1){
                count++;
                perv = perv.next;
            }
            if (perv != null){
                node.next = perv.next;
                perv.next = node;
            }
            return head;
        }
    }
    public static Node<Integer> deleteNode(Node<Integer> head, int i)
    {
        if(head==null )
            return head;
        if(i==0)
            return head.next;
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null && count<i-1)
        {
            temp=temp.next;
            count++;
        }
        if(temp==null)
            return head;
        if(temp.next!=null)
            temp.next=temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();//createLinkedList();
        head = insert(head,10,3);
//        increment(head);
        print(head);
        head = deleteNode(head,0);
        print(head);
//        System.out.println(length(head));
//        printIthNode(head,2);
//        Node<Integer> n1 = new Node<>(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
