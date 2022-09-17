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

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputTreeBetter(true,1,false);
        printTreeDetailed(root);
    }
}
