package Test3;

import java.util.ArrayList;

public class check {
    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    class TreeNode<T> {
        T data;
        ArrayList<TreeNode<T>> children;

        TreeNode(T data){
            this.data = data;
            children = new ArrayList<TreeNode<T>>();
        }
    }
    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        return !isSiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);
    }
    public static boolean isSiblings(BinaryTreeNode<Integer> root,int node1,int node2) {

        if(root==null) {
            return false;
        }
        if(root.left!=null && root.right!=null) {

            if(root.left.data == node1 && root.right.data == node2) {
                return true;
            }

        }
        return isSiblings(root.left, node1, node2) || isSiblings(root.right, node1, node2);

    }
    public static int level(BinaryTreeNode<Integer> root,int k,int node1) {

        if(root==null)
            return -1;
        if(root.data == node1) {
            return k;
        }
        int left  = level(root.left, k+1, node1);
        int right = level(root.right, k+1, node1);
        if(left==-1) {
            return right;
        }
        if(right==-1) {
            return left;
        }

        return -1;
    }
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        if(root==null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> leftArrayList = longestRootToLeafPath(root.left);
        ArrayList<Integer> rightArrayList = longestRootToLeafPath(root.right);

        if(leftArrayList.size()>=rightArrayList.size()) {

            leftArrayList.add(root.data);
            return leftArrayList;
        }
        else {
            rightArrayList.add(root.data);
            return rightArrayList;
        }
    }
    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        if(root==null){ return null;}// if root is null return null
        if(root.children.size()==0){// if root itself is leaf return null
            return null;
        }
        // if root.children is a leaf node
        // then delete it from children vector
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child= root.children.get(i);
            if (child.children.size() == 0) {
                // shifting the vector to left
                // after the point i
                for (int j = i; j < root.children.size() - 1; j++)
                    root.children.set(j, root.children.get(j + 1));
                // delete the last element
                root.children.remove(root.children.size()-1);
                i--;
            }
        }
        // Remove all leaf node
        // of children of root
        for (int i = 0;
             i < root.children.size();
             i++) {
            // call function for root.children
            root.children.set(i,removeLeafNodes(root.children.get(i)));
        }
        return root;
    }
    public static void main(String[] args) {

    }
    class LinkedListNode<T>
	  {
	 		T data;
	    	LinkedListNode<T> next;
	 		public LinkedListNode(T data) {
                 this.data = data;
             }
	  }
}
