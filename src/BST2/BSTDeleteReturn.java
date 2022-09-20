package BST2;

import BSTI.BinaryTreeNode;

public class BSTDeleteReturn {
    BinaryTreeNode<Integer> root;
    boolean deleted;
    public BSTDeleteReturn(BinaryTreeNode<Integer> root,boolean deleted){
        this.root =root;
        this.deleted = deleted;
    }
}
