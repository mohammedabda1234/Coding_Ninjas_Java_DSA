package Recurion1;

public class Array {
    public static boolean isSorted(int[] arr){
        if (arr.length == 1){
            return true;
        }
        if (arr[0] > arr[1]){
            return false;
        }
        int[] smallArray =  new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        boolean isSmallArraySorted = isSorted(smallArray);
        return isSmallArraySorted;
    }
    public static boolean isSorted(int[] arr,int startIndex){
        if (startIndex == arr.length -1){
            return true;
        }
        if (arr[startIndex]>arr[startIndex +1]){
            return false;
        }
        boolean isSmallArraySorted = isSorted(arr,startIndex +1);
        return isSmallArraySorted;

    }
    public static void main(String[] args) {
        int[] arr = {2,4,5};
        System.out.println(isSorted(arr,0));
    }
}
