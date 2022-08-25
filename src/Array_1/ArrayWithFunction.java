package Array_1;

public class ArrayWithFunction {
    public static void  print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void increment(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9};
        increment(arr);
        print(arr);
    }
}
