package Trees;
import Queues.QueueUsingLL;

import java.util.*;
public class TreeTest {
    public static void printTree(TreeNode<Integer> root){
        if (root == null){//spacial case not base case
            return;
        }
        System.out.print(root.data+" ");
        for (int i = 0;i< root.children.size();i++){
            TreeNode<Integer>child = root.children.get(i);
            printTree(child);
        }
    }
    public static void printTree1(TreeNode<Integer> root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" : ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer>child = root.children.get(i);
            printTree1(child);
        }
    }

    public static int numOfNode(TreeNode<Integer>root){
        int count = 1;
        if ( root == null){
            return 0;
        }
        for (int i = 0; i < root.children.size(); i++) {
            int countChild = numOfNode(root.children.get(i));
            count+=countChild;
        }
        return count;
    }
    public static int sumOfAllNode(TreeNode<Integer> root){
        int sum = 0;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode<Integer> p = queue.peek();
            sum += p.data;
            queue.poll();
            int childSize = p.children.size();
            for (int i=0;i<childSize;i++){
                queue.add(p.children.get(i));
            }
        }
        return sum;
    }

    public static TreeNode<Integer> takeInputLevel(){
        Scanner s = new Scanner(System.in);
        QueueUsingLL<TreeNode<Integer>> pending = new QueueUsingLL<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        if (rootData == -1){
            return null;
        }
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pending.enqueue(root);
        while (!pending.isEmpty()){
            TreeNode<Integer> front = pending.dequeue();
            System.out.println("Enter number of child of :"+front.data);
            int numOfChild = s.nextInt();
            for (int i = 0; i < numOfChild; i++) {
                System.out.println("Enter the "+(i+1)+" th data of "+front.data);
                int childData = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                front.children.add(childNode);
                pending.enqueue(childNode);
            }

        }
        return root;
    }
    public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            while (n>0){
                TreeNode<Integer> p = queue.peek();
                queue.poll();
                System.out.print(p.data + " ");
                for (int i=0;i<p.children.size();i++){
                    queue.add(p.children.get(i));
                }
                n--;
            }
            System.out.println();
        }
    }
    public static int numNodeGreater(TreeNode<Integer> root,int x){

        int count = 0;
        if (root.data>x){
            count++;
        }
        for (int i=0;i<root.children.size();i++){
            count += numNodeGreater(root.children.get(i),x);
        }
        return count;
    }
    public static int getHeight(TreeNode<Integer> root){

        if (root == null){
            return 0;
        }
        int h = 0;

        for (int i=0;i<root.children.size();i++){
            h = Math.max(h,getHeight(root.children.get(i)));
        }
        return h+1;
    }
    public static int countLeafNodes(TreeNode<Integer> root){
        int count = 0;
        if (root.children.size() == 0){
            return 1;
        }
        for (int i=0;i<root.children.size();i++){
            count += countLeafNodes(root.children.get(i));
        }
        return count;

    }
    public static void replaceWithDepthValue(TreeNode<Integer> root){

        int depth = 0;
        replace(root,depth);
    }
    private static void replace(TreeNode<Integer> root,int depth){
        if (root == null){
            return;
        }
        root.data = depth;
        depth++;
        for (int i=0;i<root.children.size();i++){
            replace(root.children.get(i),depth);
        }
        return;
    }
    public static void printPostOrder(TreeNode<Integer> root){

        if (root == null){
            return;
        }
        for (TreeNode<Integer> node: root.children){
            printPostOrder(node);
        }
        System.out.print(root.data+" ");
    }
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root==null) {
            return false;
        }
        if(root.data == x) {
            return true;
        }
        for(int i=0;i<root.children.size();i++) {
            if( checkIfContainsX(root.children.get(i), x) ) {
                return true;
            }
        }
        return false;
    }
    private static int sum(TreeNode<Integer> root) {
        if(root==null) {
            return 0;
        }
        int sum= root.data;
        for(int i=0;i<root.children.size();i++) {
            sum+=root.children.get(i).data;
        }
        return sum;
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){

        if(root==null) {
            return null;
        }
        int sumRoot = sum(root);
        int max=Integer.MIN_VALUE;
        TreeNode<Integer> maxNode = null;
        for(int i=0;i<root.children.size();i++) {

            TreeNode<Integer> maxNode1 =maxSumNode(root.children.get(i));
            int sum = sum(maxNode1);
            if( max < sum ) {
                max = sum;
                maxNode = maxNode1;
            }
        }
        if( sumRoot > max ) {
            return root;
        }
        return maxNode;

    }
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){


        if(root1==null && root2==null) {
            return true;
        }
        if((root1==null && root2!=null ) || ( root2==null && root1!=null )) {
            return false;
        }
        if(root1.data != root2.data) {
            return false;
        }
        if(root1.children.size()!=root2.children.size()) {
            return false;
        }
        for(int i=0;i<root1.children.size();i++) {

            if( !checkIdentical(root1.children.get(i),root2.children.get(i))) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevel();
        printTree1(root);
    }
}
