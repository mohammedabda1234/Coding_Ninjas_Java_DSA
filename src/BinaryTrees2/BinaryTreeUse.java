package BinaryTrees2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

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

    public static void printTree(BinaryTreeNode<Integer> root){
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
    public static BinaryTreeNode<Integer> takeInputTree(){
        System.out.println("Enter root Data ");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputTree();
        BinaryTreeNode<Integer> rightChild = takeInputTree();
        root.left = leftChild;
        root.right = rightChild;
        return  root;
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
    public static int numNode(BinaryTreeNode<Integer> root){
        if (root == null){
            return  0;
        }
        int left = numNode(root.left);
        int right  = numNode(root.right);
        return 1 +left+right;
    }
    public static int getSum(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        return (root.data + getSum(root.left)+getSum(root.right));
    }
    public static void preOrder(BinaryTreeNode<Integer> root){
        if (root == null){// order of per order(root,left,right)
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(BinaryTreeNode<Integer> root){
        if (root == null){//postorder (left right root)
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static int largest(BinaryTreeNode<Integer> root){
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
    public static int highest(BinaryTreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int left = highest(root.left);
        int right = highest(root.right);
        return 1+Math.max(left,right);
    }

    public static int numLeaves(BinaryTreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void depthK(BinaryTreeNode<Integer> root, int k){
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
    public static void changeToDepthTree(BinaryTreeNode<Integer> root)
    {
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
    public static void withoutSibling(BinaryTreeNode<Integer> root){
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
    public static BinaryTreeNode<Integer>removeLeaves(BinaryTreeNode<Integer>root){
        if (root == null){
            return null;
        }
        if (root.left == null && root.right == null){
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){

        if (root == null) {
            return;
        }

        // We will do a post-order traversal of the binary tree.

        if (root.left != null) {
            mirrorBinaryTree(root.left);
        }

        if (root.right != null) {
            mirrorBinaryTree(root.right);
        }

        // Let's swap the left and right nodes at current level.

        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public static int hight(BinaryTreeNode<Integer>root){
        if (root == null){
            return 0;
        }
        int left = hight(root.left);
        int right = hight(root.right);
        return 1 + Math.max(left,right);
    }
    public static boolean isBalanced(BinaryTreeNode<Integer>root){
        if (root == null){
            return true;
        }
        int left = hight(root.left);
        int right = hight(root.right);
        if (Math.abs(left - right) > 1){
            return false;
        }
        boolean isLeft = isBalanced(root.left);
        boolean isRight = isBalanced(root.right);
        return isRight && isRight;
    }
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer>root){
        if (root == null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }
        BalancedTreeReturn left = isBalancedBetter(root.left);
        BalancedTreeReturn right = isBalancedBetter(root.right);
        boolean isBal = true;

        int height = 1 + Math.max(left.height,right.height);
        if (Math.abs(left.height - right.height) > 1){
            isBal = false;
        }
        if (!left.isBalanced || !right.isBalanced){
            isBal = false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){

        if (root == null)
            return 0;

        // get the height of left and right sub-trees
        int lheight = hight(root.left);
        int rheight = hight(root.right);

        // get the diameter of left and right sub-trees
        int ldiameter = diameterOfBinaryTree(root.left);
        int rdiameter = diameterOfBinaryTree(root.right);

        return 1 + Math.max(lheight + rheight,
                Math.max(ldiameter, rdiameter));
    }
    public static BinaryTreeNode<Integer>takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pending = new LinkedList<>();
        pending.add(root);
        while (!pending.isEmpty()){
            BinaryTreeNode<Integer> front = pending.poll();
            System.out.println("Enter left data of "+front.data);
            int left = sc.nextInt();
            if (left != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pending.add(leftChild);
            }

            System.out.println("Enter right data of "+front.data);
            int right = sc.nextInt();
            if (right != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.left = rightChild;
                pending.add(rightChild);
            }
        }
        return root;
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root==null)
        {
            return;
        }
        Queue<BinaryTreeNode<Integer>> nodesToPrint=new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        while(!nodesToPrint.isEmpty())
        {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();
            System.out.print(front.data+":");
            if (front.left!=null)
            {
                nodesToPrint.add(front.left);
                System.out.print("L:"+front.left.data);
            }
            else
            {
                System.out.print("L:-1");
            }

            if (front.right!=null)
            {
                nodesToPrint.add(front.right);
                System.out.print(",R:"+front.right.data);
            }
            else
            {
                System.out.print(",R:-1");
            }
            System.out.println();
        }
    }
    public static BinaryTreeNode<Integer>buildTreeFromPerInHelper(int[] per,int[] in,int siPer,int eidPer,int siIn,int eiIn){
        if (siPer > eidPer){
            return null;
        }
        int rootData = per[siPer];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        int  rootIndex = -1;
        for (int i = siIn ;i <= eiIn ; i++){
            if (in[i] == rootData){
                rootIndex = i;
                break;
            }
        }


        int siPreLeft = siPer +1;
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;
        int eiPreRight = eidPer;
        int siInRight = rootIndex + 1;
        int eiInRight = eiIn;

        int leftSubTreeLenght = eiInLeft - siInLeft + 1;
        int eiPreLeft = siPreLeft + leftSubTreeLenght - 1;
        int siPreRight = eiPreLeft + 1;

        BinaryTreeNode<Integer> left = buildTreeFromPerInHelper(per,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
        BinaryTreeNode<Integer> right = buildTreeFromPerInHelper(per,in,siPreRight,eiPreRight,siInRight,eiInRight);
        return root;
    }
    public static BinaryTreeNode<Integer>buildTreeFromPerIn(int[] per,int[] in){
        BinaryTreeNode<Integer> root = buildTreeFromPerInHelper(per,in,0,per.length -1,0,in.length -1);
        return root;
    }


    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {

        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0 ,postOrder.length-1, 0, inOrder.length-1);
        return root;
    }
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost, int eiPost, int siIn, int eiIn) {
        // TODO Auto-generated method stub

        //Base case - If number of elements in the post-order is 0
        if (siPost>eiPost)
        {
            return null;
        }

        //Defining the root node for current recursion
        int rootData=postOrder[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndex=-1;
        for (int i=siIn;i<=eiIn;i++)
        {
            if (rootData==inOrder[i])
            {
                rootIndex=i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;

        //Defining the index limits for Left Subtree Preorder
        int siPostLeft=siPost;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPostLeft=(siPostLeft)+(leftSubTreeLength-1);

        //Defining index limits for Right Subtree Inorder
        int siInRight=rootIndex+1;
        int eiInRight=eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPostRight=eiPostLeft+1;
        int eiPostRight=eiPost-1;

        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);
        BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);

        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInputTreeBetter(true,1,false);
//        BinaryTreeNode<Integer> root = takeInputLevelWise();
//        printTreeDetailed(root);
//        System.out.println("largest "+largest(root));
//        System.out.println("highest "+highest(root));
//        System.out.println("number of leaves "+numLeaves(root));
//        System.out.println(" is balanced present "+isBalanced(root));
//        System.out.println(" is balanced present "+isBalancedBetter(root).isBalanced);
//        printTreeDetailed(root);

        int[] in = {4,2,5,1,3};
        int[] pre = {1,2,4,5,3};
        BinaryTreeNode<Integer> root = buildTreeFromPerIn(pre,in);
        printTree(root);
    }
}
