package Array_1;

public class ArrangeNumbers {
    public static void arrange(int[] arr, int n) {
        int idx=0;
        for (int i=1;i<=n;i=i+2)
        {
            arr[idx]=i;
            idx=idx+1;
        }
        int i=0;
        if (n%2==0)
        {
            i=n;
        }
        else
        {
            i=n-1;
        }
        for (;i>=2;i=i-2)
        {
            arr[idx]=i;
            idx=idx+1;
        }
    }
    static void  print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,4,2,1};
        arrange(arr,arr.length -1);
        print(arr);
    }
}
