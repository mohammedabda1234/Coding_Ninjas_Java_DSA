package BST2;
import BSTI.BinaryTreeNode;
public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer>node,int x){
        if (node == null){
            return false;
        }
        if (node.data == x){
            return true;
        }
        if (x < node.data){
            //call left side
            return isPresentHelper(node.left,x);
        }else {
            //call right side
            return isPresentHelper(node.right,x);
        }
    }
    public boolean isPresent(int x){
       return isPresentHelper(root,x);
    }
    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer>node,int x){
        if (node == null){
            BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<>(x);
            return newRoot;
        }
        if (x >= node.data){
            node.right = insert(node.right,x);
        }else {
            node.left =insert(node.left,x);
        }
        return node;
    }
    public void insert(int x){
        root = insert(root,x);
        size++;
    }

    private static int minimum(BinaryTreeNode<Integer>root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return  Math.min(root.data,Math.min(leftMin,rightMin));
    }
    private static BSTDeleteReturn deleteData(BinaryTreeNode<Integer>root,int x){
        if (root == null){
            return new BSTDeleteReturn(null,false);
        }
        if (root.data < x){
            BSTDeleteReturn rightOut = deleteData(root.right,x);
            root.right = rightOut.root;
            rightOut.root = root;
            return rightOut;
        }
        if (root.data > x){
            BSTDeleteReturn leftOut = deleteData(root.left,x);
            root.left = leftOut.root;
            leftOut.root = root;
            return leftOut;
        }
        // 0 child
        if (root.left == null && root.right == null){
            return new BSTDeleteReturn(null,true);
        }
        // one left child
        if (root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left,true);
        }
        // one right child
        if (root.left == null && root.right != null){
            return new BSTDeleteReturn(root.right,true);
        }
        // both side are present
        int rightMin = minimum(root.right);
        root.data = rightMin;
        BSTDeleteReturn outRight = deleteData(root.right,rightMin);
        root.right =outRight.root;
        return new BSTDeleteReturn(root,true);
    }
    public boolean deleteData(int x){
        BSTDeleteReturn out = deleteData(root,x);
        root = out.root;
        if (out.deleted){
            size--;
        }
        return out.deleted;
    }
    public int size(){
        return size;
    }
    private static void printTreeHelper(BinaryTreeNode<Integer>node){
        if (node == null){
            return;
        }
        System.out.print(node.data+" : ");
        if (node.left != null){
            System.out.print(" L "+node.left.data+" , ");
        }
        if (node.right != null){
            System.out.print(" R "+node.right.data);
        }
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
    private static ArrayList<LinkedListNode<Integer>> arr = new ArrayList<LinkedListNode<Integer>>();
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if (root==null)
            return null;

        Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        nodesToPrint.add(null);
        LinkedListNode<Integer> head = null,tail=null;
        //arr.add(head);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front=nodesToPrint.poll();
            if (front==null)
            {
                if (nodesToPrint.isEmpty())
                    break;
                else
                {
                    //System.out.println();
                    nodesToPrint.add(null);
                    tail.next=null;
                    tail=tail.next;
                    head=null;

                }

            }
            else
            {
                if (head==null)
                {
                    head = new LinkedListNode<Integer>(front.data);
                    tail=head;
                    arr.add(head);
                }
                else
                {
                    tail.next=new LinkedListNode<Integer>(front.data);
                    tail=tail.next;
                }
                //System.out.print(front.data+" ");
                if (front.left!=null)
                    nodesToPrint.add(front.left);
                if (front.right!=null)
                    nodesToPrint.add(front.right);
            }
        }
        return arr;
    }
    public void printTree()
    {
        printTreeHelper(root);

    }
    class LinkedListNode<T> {
	 	T data;
	 		LinkedListNode<T> next;
	 		public LinkedListNode(T data) {
                 this.data = data;
             }
	   }
}
