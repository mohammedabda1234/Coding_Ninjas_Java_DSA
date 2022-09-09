package TimeComplexity;

public class ArrayIntersection {
    public static void intersection(int[] arr1,int[] arr2){
        sort(arr1,0,arr1.length-1);
        sort(arr2,0,arr2.length-1);
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i]<arr2[j]){
                i++;
            } else if (arr2[j]<arr1[i]) {
                j++;
            }else {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }

    public static void sort(int[] arr,int low,int high){
        if (low < high){//base case
            int p = partition(arr,low,high);
            sort(arr,low,p -1);// left part
            sort(arr,p+1,high);//right part
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        int j = low;
        while (i<= high){
            if (arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void main(String[] args) {
        int[] arr1 = {3,6,7,8,9};
        int[] arr2 = {2,8,6,3,1};
        intersection(arr1,arr2);
    }
}
