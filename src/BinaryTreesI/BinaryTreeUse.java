package BinaryTreesI;

import java.util.Scanner;

public class BinaryTreeUse {

    public static void printTreeDetailed(BinaryTreeNode<Integer>root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" -->");
        if (root.left != null){
            System.out.print(" L "+root.left.data+" , ");
        }
        if (root.right != null){
            System.out.print(" R "+root.right.data);
        }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static void printTree(BinaryTreeNode<Integer>root){
        if (root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
//        if (root.left != null){
//            printTree(root.left);
//        }
//        if (root.right != null){
//            printTree(root.right);
//        }
    }
    public static BinaryTreeNode<Integer>takeInputTree(){
        System.out.println("Enter root Data ");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer>  leftChild = takeInputTree();
        BinaryTreeNode<Integer> rightChild = takeInputTree();
        root.left = leftChild;
        root.right = rightChild;
        return  root;
    }

    public static BinaryTreeNode<Integer>takeInputTreeBetter(boolean isRoot,int parentData,boolean isLeft){
       if (isRoot) {
           System.out.println("Enter root Data ");
       }else {
           if (isLeft){
               System.out.println("Enter left child of "+parentData);
           }else {
               System.out.println("Enter right child of "+parentData);
           }
       }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer>  leftChild = takeInputTreeBetter(false,rootData,true);
        BinaryTreeNode<Integer> rightChild = takeInputTreeBetter(false,rootData,false);
        root.left = leftChild;
        root.right = rightChild;
        return  root;
    }
    public static int numNode(BinaryTreeNode<Integer>root){
        if (root == null){
            return  0;
        }
        int left = numNode(root.left);
        int right  = numNode(root.right);
        return 1 +left+right;
    }
    public static int getSum(BinaryTreeNode<Integer>root){
        if(root == null){
            return 0;
        }
        return (root.data + getSum(root.left)+getSum(root.right));
    }
    public static void preOrder(BinaryTreeNode<Integer>root){
        if (root == null){// order of per order(root,left,right)
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(BinaryTreeNode<Integer>root){
        if (root == null){//postorder (left right root)
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static int largest(BinaryTreeNode<Integer>root){
        if (root == null){
            return -1;
        }
        int left = largest(root.left);
        int right = largest(root.right);
        return Math.max(root.data,Math.max(left,right));
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputTreeBetter(true,1,false);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println("largest "+largest(root));
//        int result = numNode(root);
//        System.out.println(result);
//        int sum = getSum(root);
//        System.out.println(sum);
    }
}
