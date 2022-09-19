package BSTI;
import java.util.*;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class LL {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        ArrayList<Integer> list = new ArrayList<>();

        helper(root,list);

        Collections.sort(list);

        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        int i=0;
        while(i<list.size())
        {
            LinkedListNode<Integer> cn = new LinkedListNode<Integer>(list.get(i));

            if(head==null)
            {
                head=cn;
                tail = cn;
            }
            else
            {
                tail.next=cn;
                tail=tail.next;
            }
            i++;
        }
        return head;
    }
    public static void helper(BinaryTreeNode<Integer> root, ArrayList<Integer> list)
    {
        if(root==null)
        {
            return;
        }

        list.add(root.data);
        helper(root.left,list);
        helper(root.right,list);


    }
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null)
        {
            return -1;
        }

        if(a<root.data && b<root.data)
        {
            return getLCA(root.left,a,b);
        }
        if(a>root.data && b>root.data)
        {
            return getLCA(root.right,a,b);
        }
        return root.data;
    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {

        helper(root,0);
    }
    public static int helper(BinaryTreeNode<Integer> root,int sum) {

        if(root==null) {
            return 0;
        }
        int sumOfGreaterNodes = helper(root.right,sum);
        int temp = root.data;
        root.data += sumOfGreaterNodes + sum;
        int leftSum  = helper(root.left,root.data);
        return temp + leftSum+ sumOfGreaterNodes ;


    }
}
