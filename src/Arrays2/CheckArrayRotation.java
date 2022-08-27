package Arrays2;

public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){
        int n = arr.length;
        int index = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                index = i+1;
            }
        }
        return index;
    }
    public static void main(String[] args) {

    }
}
