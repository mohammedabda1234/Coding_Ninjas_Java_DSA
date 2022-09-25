package PriorityQueues1;

import java.util.ArrayList;

public class Priority_Queues<T> {
    private ArrayList<Element<T>> heap;

    public Priority_Queues(){
        heap =new ArrayList<>();
    }

    public void insert(T value,int priority){
        Element<T> e = new Element<>(value,priority);
        heap.add(e);
        int childIndex = heap.size() -1;
        int parentIndex = (childIndex - 1)/2;

        while (parentIndex > 0) {
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex -1)/2;
            }else {
                return;
            }
        }
    }
    public T getMin() throws PriorityQueuesException {
        if (isEmpty()){
            throw new PriorityQueuesException();
        }
        return heap.get(0).value;
    }
    public T removeMin() throws PriorityQueuesException {
        if (isEmpty()) {
            throw new PriorityQueuesException();
        }
        Element<T> temp = heap.get(0);
        T ans = temp.value;
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int parentIndex = 0;
        int leftIndex = 2 * parentIndex +1;
        int rightIndex = 2 * parentIndex +2;

        while (leftIndex < heap.size()) {
            int minIndex = parentIndex;
            if (heap.get(leftIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex).priority < heap.get(minIndex).priority) {
                minIndex = rightIndex;
            }
            if (minIndex == parentIndex) {
                break;
            }else {
                Element<T> temp1 = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(minIndex));
                heap.set(minIndex, temp1);
                parentIndex = minIndex;
                leftIndex = 2*parentIndex +1;
                rightIndex = 2*parentIndex + 2;
            }
        }
        return ans;
    }
    public int size(){
        return heap.size();
    }
    public boolean isEmpty(){
        return  size() == 0;
    }
}
