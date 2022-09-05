package OOP1;

public class DynamicArray {
    private int[] data;
    private int nextElementIndex;

    DynamicArray(){
       data = new int[5];
       nextElementIndex = 0;
    }
    public int size(){
        return nextElementIndex;
    }
    public boolean isEmpty(){
        return nextElementIndex == 0;
    }
    public int get(int elem){
        if (elem >= nextElementIndex){
            //throw error
            return  -1;
        }
        return data[elem];
    }
    public void set(int index ,int elem){
        if (index >= nextElementIndex){
            // error
            return;
        }
        data[index] = elem;
    }
    public void add(int elem){
        if (nextElementIndex == data.length){
            doubleCapacity();
        }
        data[nextElementIndex] = elem;
        nextElementIndex++;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }
    public int removeLast(){
        if (nextElementIndex == 0){
            return -1;
        }
        int temp = data[nextElementIndex -1];
        data[nextElementIndex -1] = 0;
        nextElementIndex--;
        return temp;
    }
}
