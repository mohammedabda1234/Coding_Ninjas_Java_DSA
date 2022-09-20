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
    public boolean deleteData(int x){
        return false;
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
    public void printTree(){
        printTreeHelper(root);
    }
}
