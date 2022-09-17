package Test2DSA;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class Solution {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> n) {

        if(n== null)
            return n;

        LinkedListNode<Integer> current=n;
        LinkedListNode<Integer> prev=null;
        int length=0;
        LinkedListNode<Integer> last=current;
        while(current!=null)
        {
            length++;
            if(current.data!=9)
                prev=current;

            last=current;
            current=current.next;
        }// Now last is pointing to last digit.
        //  Prev is pointing to last non 9.
        if(prev==null)
        {
            //case when number is all 9
            LinkedListNode<Integer> head=new LinkedListNode<Integer>(1);
            head.next=n;

            while(n!=null)
            {
                n.data=0;
                n=n.next;
            }
            return head;
        }else
        {
            prev.data=prev.data+1;
            prev=prev.next;
            while(prev!=null)
            {
                prev.data=0;
                prev=prev.next;
            }
            return n;
        }

    }
}
