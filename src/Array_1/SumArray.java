package Array_1;

public class SumArray {
    public static int sum(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num+= arr[i];
        }
        return  num;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,0};
        int result = sum(arr);
        System.out.println(result);
    }
}
