package PriorityQueuesII;

import java.util.*;

public class KLargest {
    public static boolean checkMaxHeap(int arr[]) {

        for(int  i=0;i<arr.length;i++) {

            int parentIndex = i;
            int leftChildIndex = 2*i + 1;
            int rightChildIndex = 2*i + 2;

            if( leftChildIndex < arr.length && arr[parentIndex] < arr[leftChildIndex] ) {
                return false;
            }
            if( rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex] ) {
                return false;
            }

        }
        return true;
    }
    public static int kthLargest(int n, int[] arr, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<k;i++)
            priorityQueue.add(arr[i]);
        for(int i= k ;i < arr.length;i++) {
            if(arr[i] > priorityQueue.peek() ) {
                priorityQueue.remove();
                priorityQueue.add(arr[i]);
            }
        }
        return priorityQueue.remove();
    }
    public static int buyTicket(int input[], int k) {

        int timer = 0;
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<input.length;i++){
            queue.add(i);
            pq.add(input[i]);
        }
        int i=0;
        while (!queue.isEmpty()){
            if (input[queue.peek()] < pq.peek()){
                queue.add(queue.poll());
            }else{
                int temp = queue.poll();
                pq.remove();
                timer++;
                if (temp == k){
                    return timer;
                }
            }
        }
        return timer;
    }
    public static void printKLargest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {//to store k elements
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]){
                pq.poll();// to remove small elements
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {

        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<k;i++)
        {
            pq.add(input[i]);
        }

        for(int i =k;i<n;i++)
        {

            if(pq.peek()>input[i])
            {
                pq.poll();
                pq.add(input[i]);
            }
        }
        while(!pq.isEmpty())
        {
            ans.add(pq.peek());
            pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr  = {6,7,3,1,2,9,0,4,5,8};
        int k = 3;
        int n = arr.length -1;
        printKLargest(arr,k);
        ArrayList<Integer> out = kSmallest(n,arr,k);
        for (int i :out) {
            System.out.println(i);
        }
    }
}
