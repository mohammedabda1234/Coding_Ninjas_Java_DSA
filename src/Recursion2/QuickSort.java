package Recursion2;

public class QuickSort {
   public static void sort(int[] arr,int low,int high){
       if (low < high){//base case
           int p = partition(arr,low,high);
           sort(arr,low,p -1);// left part
           sort(arr,p+1,high);//right part
       }
   }

    private static int partition(int[] arr, int low, int high) {
       int pivot = arr[high];
       int i = low;
       int j = low;
       while (i<= high){
           if (arr[i] <= pivot){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
           }
           i++;
       }
       return j-1;
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {67,8,90,4,23,1,0};
        sort(arr,0,arr.length -1);
        print(arr);

    }
}
