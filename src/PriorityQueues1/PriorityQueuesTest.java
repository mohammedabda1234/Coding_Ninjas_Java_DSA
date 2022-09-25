package PriorityQueues1;

public class PriorityQueuesTest {
    public static void main(String[] args) throws PriorityQueuesException {
        Priority_Queues<String> pq = new Priority_Queues<>();
        pq.insert("abc",15);
        pq.insert("der",20);
        pq.insert("gfrd",10);
        pq.insert("ytg",70);
        pq.insert("bvfg",50);
        while (!pq.isEmpty()){
            System.out.print(pq.getMin()+" ");
            pq.removeMin();
        }
    }
}
