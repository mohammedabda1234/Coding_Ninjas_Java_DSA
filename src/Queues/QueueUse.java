package Queues;

public class QueueUse {
    public static void main(String[] args) {
//        QueuesUsingArray queue = new QueuesUsingArray(2);
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();

        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
//        int[] data = {10,20,30,40,50,60,70,80,90};
//        for (int elem:data){
//            queue.enqueue(elem);
//        }
//       while (!queue.isEmpty()){
//           System.out.println(queue.dequeue());
//       }

    }
}
