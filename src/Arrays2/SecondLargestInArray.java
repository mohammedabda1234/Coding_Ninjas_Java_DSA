package Arrays2;

public class SecondLargestInArray {
    public static int secondLargest(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return  secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,1,9};
        int n = secondLargest(arr);
        System.out.println(n);
    }
}
