package Arrays2;

public class PushZeroToEnd {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        while (count < n)
            arr[count++] = 0;
    }
    public static void push(int[] arr){
      int n = arr.length;
      int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        while (count < n){
            arr[count++] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = {2,0,7,0,4,3,0};
//        print(arr);
        push(arr);
        print(arr);
    }
}
