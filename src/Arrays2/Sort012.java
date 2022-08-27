package Arrays2;

public class Sort012 {
    public static void sort(int[] arr){
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (i <= k){
            if (arr[i] == 0){
                swap(arr,i,j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            }else if (arr[i] == 2){
                swap(arr,i,k);
                    k--;
                }
            }
        }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public  static void print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr ={1,1,2,0,1,0,2,1,0};
        print(arr);
        sort(arr);
        print(arr);
    }
}
