package Array_1;

public class LargestElement {
    public static  int largest(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return  max;
    }
    public static void main(String[] args) {
        int[] nums = {7,5,6,8,9,2,3};
        int m = largest(nums);
        System.out.println(m);
    }
}
