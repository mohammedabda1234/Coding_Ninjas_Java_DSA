package Array_1;

public class PrintPair {
    public static void pair(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n -1 ; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,7,8,9,1};
        pair(arr);
    }
}
