package Array_1;

public class Move {
    public static void moveZero(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }
    public static void  print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {3,0,7,0,7,4,0,2};
        moveZero(nums);
        print(nums);
    }
}
