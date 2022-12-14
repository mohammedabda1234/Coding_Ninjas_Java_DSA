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
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }

        int countLeft = countNodesGreaterThanX(root.left, x);
        int countRight = countNodesGreaterThanX(root.right, x);

        return (root.data > x ? 1 : 0) + countLeft + countRight;
    }
    public static int highest(BinaryTreeNode<Integer>root){
        if (root == null){
            return 0;
        }
        int left = highest(root.left);
        int right = highest(root.right);
        return 1+Math.max(left,right);
    }

    public static int numLeaves(BinaryTreeNode<Integer>root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void depthK(BinaryTreeNode<Integer>root,int k){
        if (root == null){
            return;
        }
        if (k == 0){
            System.out.print(root.data+" ");
            return;
        }
        depthK(root.left,k - 1);
        depthK(root.right,k - 1);
    }
    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        helper(root,0);
    }

    public static BinaryTreeNode<Integer> helper(BinaryTreeNode<Integer> root, int depth)
    {
        if(root==null)
        {
            return null;
        }

        root.data=depth;
        if(root.left!=null)
        {
            helper(root.left,depth+1);
        }
        if(root.right!=null)
        {
            helper(root.right,depth+1);
        }
        return root;
    }

    static boolean ifNodeExists(BinaryTreeNode<Integer> root, int key){
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        // then recur on left subtree /
        boolean res1 = ifNodeExists(root.left, key);
        // node found, no need to look further
        if(res1) return true;
        // node is not found in left,
        // so recur on right subtree /
        boolean res2 = ifNodeExists(root.right, key);
        return res2;
    }
    public static void withoutSibling(BinaryTreeNode<Integer>root){
        if (root == null){
            return;
        }
        if (root.left != null && root.right != null){
            System.out.print(root.left.data+" ");
            withoutSibling(root.left);
        }
        if (root.left != null && root.right != null){
            System.out.print(root.right.data+" ");
            withoutSibling(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputTreeBetter(true,1,false);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println("largest "+largest(root));
        System.out.println("highest "+highest(root));
        System.out.println("number of leaves "+numLeaves(root));
        System.out.println("print depth k ");
        depthK(root,2);
        System.out.println("is node present "+ifNodeExists(root,2));
        System.out.println("Nodes Without Sibling ");
        withoutSibling(root);
//        int result = numNode(root);
//        System.out.println(result);
//        int sum = getSum(root);
//        System.out.println(sum);
    }
}
