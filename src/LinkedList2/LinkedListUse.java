package LinkedList2;
import java.util.Scanner;
  class DoubleNode {
     Node<Integer> head;
     Node<Integer> tail;
     DoubleNode() {}
     DoubleNode(Node<Integer> head, Node<Integer> tail) {
         this.head = head;
         this.tail = tail;
     }
 }
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
    public static void print(Node<Integer> head){
//        System.out.println("print "+head);
        while (head !=null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();
//        System.out.println(head.next);
//        System.out.println(head.next.data);
    }
    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            temp.data++;
            temp = temp.next;
        }
    }
    public static int length(Node<Integer> head){
        Node<Integer> temp = head;
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
    public static Node<Integer> insert(Node<Integer> head, int elem, int pos){
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
    public static int findNode(Node<Integer> head, int n)
    {
        if(head==null)
            return -1;
        Node<Integer> temp=head;
        int count=0;
        while(temp!=null && temp.data!=n)
        {
            temp=temp.next;
            count++;
        }
        if(temp!=null)
            return count;
        else
            return -1;
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        int totalelements = 0;
        Node<Integer> count =head;
        if(head==null)
        {
            return null;
        }
        if(n==0)
        {
            return count;
        }
        while(count!=null)
        {
            totalelements++;
            count=count.next;
        }
        int sub = totalelements-n; //5-3=2
        Node<Integer> nh = head;
        int c=0;
        while(c<sub)
        {
            c++;
            nh=nh.next;
        }
        Node<Integer> newhead = nh;

        Node<Integer> prev = newhead;
        while(prev.next!=null)
        {
            prev=prev.next;
        }
        prev.next = head;

        Node<Integer> br = head;
        int co = 0;
        while(co<sub-1)
        {
            co++;
            br = br.next;
        }
        br.next=null;

        return newhead;
    }
    public static Node<Integer> removeDuplicates(Node<Integer> head) {

        if(head==null)
            return head;
        if(head.next==null)
            return head;
        Node<Integer> t1=head,t2=head.next;
        Node<Integer> finalhead=head;
        while(t2!=null){
            if(t1.data.equals(t2.data))
            {
                t2=t2.next;
            }
            else{
                t1.next=t2;
                t1=t2;
            }
        }

        t1.next=null;
        return finalhead;
    }
    public static void printReverse(Node<Integer> root) {
        if(root==null)
            return;
        printReverse(root.next);
        System.out.print(root.data+" ");
    }
    static Node<Integer> left=null;
    public static boolean isPalindrome(Node<Integer> head) {
        left=head;
        return find(head);
    }
    public static boolean find(Node<Integer> right){
        if(right==null){
            return true;
        }
        boolean val=find(right.next);
        if(val==true){
            if(left.data==right.data){
                left=left.next;
                return true;
            }
        }
        return false;
    }
    public static void printR(Node<Integer>head){
       if (head == null){
           return;
       }
        System.out.print(head.data+" ");
        printR(head.next);
    }
    public static void printRR(Node<Integer>head){
        if (head == null){
            return;
        }
        printR(head.next);
        System.out.print(head.data+" ");
    }
    public static Node<Integer>insertR(Node<Integer>head,int elem,int pos){
        if (head == null && pos > 0){
            return head;
        }
        if (pos == 0){
            Node<Integer> node = new Node<>(elem);
            node.next = head;
            return node;
        }else {
//            Node<Integer> smallerHead = insertR(head.next,elem,pos -1);
//            head.next =smallerHead;
            head.next = insertR(head.next,elem,pos -1);
            return head;
        }
    }
    public static Node<Integer> deleteR(Node<Integer>head,int pos){
        if (head == null && pos > 0){
            return head;
        }
        if (pos == 0){
            return head.next;
        }else {
            head.next = deleteR(head.next,pos -1);
            return head;
        }
    }
    static Node<Integer> reverse(Node<Integer> head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        Node<Integer> newHeadNode = reverse(head.next);
        // change references for middle chain
        head.next.next = head;
        head.next = null;
        // send back new head node in every recursion
        return newHeadNode;
    }
    public static Node<Integer> reverseR(Node<Integer>head){
        if (head == null ||head.next == null){
            return head;
        }
        Node<Integer> node = reverseR(head.next);
        Node<Integer> tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        head.next =null;
        return node;
    }
    public static DoubleNode reverseRBetter(Node<Integer>head){
        DoubleNode ans;
        if (head == null ||  head.next == null){
            ans = new DoubleNode(head,head);
            return ans;
        }
        DoubleNode small = reverseRBetter(head.next);
        small.tail.next = head;
        head.next = null;
        ans = new DoubleNode();
        ans.head =small.head;
        ans.tail = head;
        return ans;
    }
    public static Node<Integer> reverse_I(Node<Integer> head){
        Node<Integer> prev=null,curr=head,temp;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static Node<Integer> midPoint(Node<Integer>head){
        if (head == null || head.next == null){
            return head;
        }
            Node<Integer> fast = head,slow = head;
            while (fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
        }
        return slow;
    }
    public static Node<Integer>merge(Node<Integer>head1,Node<Integer>head2){
        if (head1 == null){
            return  head2;
        }
        if (head2 == null){
            return head1;
        }
        Node<Integer>t1 = head1,t2 = head2;
        Node<Integer> head = null,tail = null;
        if (t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null){
            if (t1.data <= t2.data){
                tail.next =t1;
                tail =t1;
                t1 = t1.next;
            }else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null){
            tail.next = t1;
        }else {
            tail.next =t2;
        }
        return  head;
    }
    static Node<Integer> mergeSort(Node<Integer> head)
    {
        if (head.next == null)
            return head;

        Node<Integer> mid = findMid(head);
        Node<Integer> head2 = mid.next;
        mid.next = null;
        Node<Integer> newHead1 = mergeSort(head);
        Node<Integer> newHead2 = mergeSort(head2);
        Node<Integer> finalHead = merge(newHead1, newHead2);

        return finalHead;
    }
    static Node<Integer> findMid(Node<Integer> head)
    {
        Node<Integer> slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static int findNodeRec(Node<Integer>head,int n){
        return helper(head,0,n);
    }

    private static int helper(Node<Integer> head, int i, int n) {
        if (head == null){
            return -1;
        }
        if (head.data == n){
            return i;
        }
        else {
            return helper(head.next,i +1,n);
        }
    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        Node<Integer> eh=null,et=null,oh=null,ot=null;
        while(head!=null){
            if(head.data%2==0){
                if(eh==null && et==null)
                {
                    eh=head;
                    et=head;

                }
                else{
                    et.next=head;
                    et=head;

                }
                head=head.next;
            }
            else{
                if(oh==null && ot==null)
                {
                    oh=head;
                    ot=head;
                }
                else{
                    ot.next=head;
                    ot=head;
                }
                head=head.next;
            }
        }
        if(oh!=null){
            ot.next=eh;
        }
        else{
            return eh;
        }
        if(eh!=null){
            et.next=null;
        }
        return oh;
    }

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
        Node<Integer> curr=head,t;
        int count;
        while(curr!=null)
        {
            for(count=1;count<M && curr!=null;count++)
            {
                curr=curr.next;
            }
            if(curr==null)
                return head;
            t=curr.next;
            for(count=1;count<=N && t!=null;count++)
            {
                t=t.next;
            }
            curr.next=t;
            curr=t;}
        return head;

    }
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if(i==j)
        {
            return head;
        }
        if(i>j)
        {
            int t = i;
            i=j;
            j=t;
        }


        Node<Integer> p1=null,p2=null,n1=null,n2=null;
        Node<Integer> temp = head;
        Node<Integer> tail = null;
        int count = 0;
        while(temp!=null)
        {
            if(count==i)
            {

                p1= tail;
                n1=temp;
            }
            else if(count==j)
            {
                p2=tail;
                n2=temp;
            }
            tail=temp;
            temp=temp.next;
            count++;

        }
        if(p1==null)
        {
            head=n2;
        }
        else
        {
            p1.next=n2;
            p2.next=n1;

        }

        Node<Integer> nextelem = n2.next;
        n2.next=n1.next;
        n1.next=nextelem;



        return head;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        if(k==0)
            return head;
        Node<Integer> h1=head,h2,t1=head;
        int count=1;
        while(count<k && t1.next!=null)
        {
            t1=t1.next;
            count++;
        }

        h2=t1.next;
        t1.next=null;


        DoubleNode ans=reversePart(h1);
        Node<Integer> secondHead=kReverse(h2,k);
        ans.tail.next=secondHead;
        return ans.head;

    }
    private static DoubleNode reversePart(Node<Integer> head)
    {
        if(head==null || head.next==null)
        { DoubleNode ans=new DoubleNode();
            ans.head=head;
            ans.tail=head;
            return ans;}

        DoubleNode ans=reversePart(head.next);
        ans.tail.next=head;
        head.next=null;
        ans.tail=ans.tail.next;
        return ans;
    }
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        if(head==null || head.next==null)
            return head;
        //Write your code here
        for(int i=0;i<lengthLL(head)-1;i++){
            Node<Integer> prev = null;
            Node<Integer> curr = head;
            Node<Integer> next = curr.next;

            while(curr.next != null){
                if(curr.data > curr.next.data){
                    if(prev == null){
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }else{
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }

    private static int lengthLL(Node<Integer> head){
        int count = 1;
        while(head.next != null){
            head = head.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node<Integer> head1 = takeInput();//createLinkedList();
        head1 = skipMdeleteN(head1,2,4);
//        head1 = evenAfterOdd(head1);
        printR(head1);
//        int index = findNodeRec(head1,2);
//        System.out.println(index);
//        Node<Integer> head2 = takeInput();
//        Node<Integer> head = merge(head1,head2);
//        head1 = mergeSort(head1);
//        printR(head1);
//        head = reverse_I(head);
//        head = midPoint(head);
//        System.out.println(head.data);
//        DoubleNode ans =reverseRBetter(head);
//        printR(head);
//        printReverse(head);
//        System.out.println(isPalindrome(head));
//        head = insert(head,10,3);
////        increment(head);
//        head = removeDuplicates(head);
//        print(head);
//        head = deleteNode(head,0);
//        print(head);
//        head = appendLastNToFirst(head,2);
//        print(head);
//        System.out.println(findNode(head,3));
//        System.out.println(length(head));
//        printIthNode(head,2);
//        Node<Integer> n1 = new Node<>(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
