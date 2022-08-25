package Array_1;

public class SwapElement {
    public static void swap(int[] arr){
        for (int i = 0; i < arr.length - 1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
         }
    }
    public  static  void  print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("before swap ");
        print(arr);
        System.out.println("after swap");
        swap(arr);
        print(arr);
    }
}
