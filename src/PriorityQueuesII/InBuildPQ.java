package PriorityQueuesII;

import java.util.PriorityQueue;

public class InBuildPQ {
    public static void main(String[] args) {
        int[] arr = {5,6,3,2,1,0,7,4};
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(i);
        }
        while (!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.poll();
        }
    }
}
