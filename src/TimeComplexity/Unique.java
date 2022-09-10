package TimeComplexity;

import java.util.Arrays;

public class Unique {
//    public static void unique(int[] arr){
//        Arrays.sort(arr);
//       int i = 0;
//       while (i< arr.length){
//           if (arr[i] != arr[i+1]){
//               System.out.print(arr[i]+" ");
//           }
//           i = i + 2;
//       }
//    }
public static int findUnique(int[] arr) {
    int ans=arr[0];
    // Arrays.sort(arr);
    for(int  i=1;i<arr.length;i++)
    {
        ans=ans^arr[i];
    }
    return ans;
}
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={2,3,2,3,4};
        Arrays.sort(arr);
        print(arr);
        System.out.println(findUnique(arr));
    }
}
