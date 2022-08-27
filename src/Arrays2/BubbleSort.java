package Arrays2;

public class BubbleSort {
    public static  void sort(int[] arr){
        int n = arr.length;
        boolean isSwap;
        for (int i = 0; i < n-1; i++) {
            isSwap = false;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            if (isSwap == false)
                break;
        }
    }
    public  static void  print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,2,4,9,0};
        sort(arr);
        print(arr);
    }
}
