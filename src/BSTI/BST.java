package BSTI;

import java.util.Scanner;

public class BST {
    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
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
    public static BinaryTreeNode<Integer> takeInputTreeBetter(boolean isRoot, int parentData, boolean isLeft){
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
        BinaryTreeNode<Integer> leftChild = takeInputTreeBetter(false,rootData,true);
        BinaryTreeNode<Integer> rightChild = takeInputTreeBetter(false,rootData,false);
        root.left = leftChild;
        root.right = rightChild;
        return  root;
    }
    public static boolean searchBST(BinaryTreeNode<Integer> root,int data){
        if (root == null){
            return false;
        }
        if (root.data == data){
            return true;
        }
        if (data < root.data){
            return searchBST(root.left,data);
        }
        return searchBST(root.right,data);
    }

    public static void printBtnK1AndK2(BinaryTreeNode<Integer>root,int k1,int k2){
        if (root == null){
            return;
        }
        if (root.data < k1){
            printBtnK1AndK2(root.right,k1,k2);
        } else if (root.data > k2) {
            printBtnK1AndK2(root.left,k1,k2);
        }else {
            System.out.println(root.data);
            printBtnK1AndK2(root.left,k1,k2);
            printBtnK1AndK2(root.right,k1,k2);
        }
    }
    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);
        if (root.data <= leftMax) {
            return false;
        }

        if (root.data > rightMin) {
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        if (isLeftBST && isRightBST) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputTreeBetter(true,0,false);
        printTreeDetailed(root);
        System.out.println(searchBST(root,3));
    }
}
