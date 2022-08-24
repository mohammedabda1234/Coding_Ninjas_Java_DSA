package Array_1;

public class LinearSearch {
    public  static  int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,0};
        int result = search(arr,9);
        System.out.println(result);
    }
}
