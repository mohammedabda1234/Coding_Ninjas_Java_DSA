package PriorityQueues1;

import java.util.ArrayList;

public class Priority_Queues<T> {
    private ArrayList<Element<T>> heap;

    public Priority_Queues(){
        heap =new ArrayList<>();
    }

    public void insert(T value,int priority){

    }
    public T getMin() throws PriorityQueuesException {
        if (isEmpty()){
            throw new PriorityQueuesException();
        }
        return heap.get(0).value;
    }
    public T removeMin(){

    }
    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return  size() == 0;
    }
}
