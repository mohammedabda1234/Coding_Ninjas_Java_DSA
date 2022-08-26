package Arrays2;

public class SelectionSort {
    public  static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n -1 ; i++) {
           int  min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,1,7,0,2};
        sort(arr);
        print(arr);
    }
}
