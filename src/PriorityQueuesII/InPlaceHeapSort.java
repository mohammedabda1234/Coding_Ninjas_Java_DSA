package PriorityQueuesII;

public class InPlaceHeapSort {
    public static void heapSort(int[] arr) {
        // build heap
        int n = arr.length;;
        for (int i = (n/2) -1; i >=0 ; i--) {
            downHeapify(arr,i,n);
        }
        // remove element from starting one by one and put them in correct position
        for (int i = n - 1; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            downHeapify(arr,0,i);
        }

    }

    private static void downHeapify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftIndex = 2 * parentIndex + 1;
        int rightIndex = 2 * parentIndex + 2;
        while (leftIndex < n){
            int minIndex = parentIndex;
            if (arr[leftIndex] < arr[minIndex]){
                minIndex = leftIndex;
            }
            if (rightIndex < n && arr[rightIndex] < arr[minIndex]){
                minIndex = rightIndex;
            }
            if (minIndex == parentIndex){
                return;
            }
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;
            parentIndex = minIndex;
            leftIndex = 2 * parentIndex + 1;
            rightIndex = 2 * parentIndex + 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,8,7,2,1,0};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
