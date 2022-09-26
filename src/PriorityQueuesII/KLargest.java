package PriorityQueuesII;

import java.util.PriorityQueue;

public class KLargest {
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
    public static void main(String[] args) {
        int[] arr  = {6,7,3,1,2,9,0,4,5,8};
        printKLargest(arr,3);
    }
}
