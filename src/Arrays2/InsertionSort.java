package Arrays2;

public class InsertionSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {//unsorted part
            int temp = arr[i];
            int j = i - 1;//sorted part
            while (j>= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];//shifting larger element with temp by one position
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public  static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,1,0,2};
        print(arr);
        sort(arr);
        print(arr);
    }
}
