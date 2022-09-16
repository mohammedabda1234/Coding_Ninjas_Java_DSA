package Queues;

public class QueueUse {
    public static void main(String[] args) {
        QueuesUsingArray queue = new QueuesUsingArray();
        int[] data = {10,20,30,40,50};
        for (int elem:data){
            queue.enqueue(elem);
        }
       while (!queue.isEmpty()){
           System.out.println(queue.dequeue());
       }
        System.out.println("front "+queue.front());
        System.out.println(" size "+queue.size());
        System.out.println(queue.isEmpty());
    }
}
