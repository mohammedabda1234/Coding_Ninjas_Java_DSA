package Arrays2;

public class MergeTwoSortedArrays {
    public  static int[] merge(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
       int[] arr3 = new int[n + m];
       int i = 0;
       int j = 0;
       int k = 0;
       while (i<n && j<m){
           if (arr1[i] <= arr2[j]){
               arr3[k] = arr1[i];
               i++;
               k++;
           }else {
               arr3[k] = arr2[j];
               j++;
               k++;
           }
       }
       if (i < n){
           arr3[k] = arr1[i];
           i++;
           k++;
       }
       while (j< m){
           arr3[k] = arr2[j];
           j++;
           k++;
       }
       return  arr3;
    }
    public static void  print(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,7,8};
        int[] arr2 = {1,2,6,9,10,20};
        int[] arr = merge(arr1,arr2);
        print(arr);
    }
}
