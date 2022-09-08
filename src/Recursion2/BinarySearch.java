package Recursion2;

public class BinarySearch {
    public static int search(int[] arr,int startIndex,int endIndex,int target){
        if (startIndex > endIndex){
            return -1;
        }
        int midIndex = (startIndex + endIndex) /2;
        if (arr[midIndex] == target){
            return midIndex;
        } else if (arr[midIndex]<target) {
            return search(arr,midIndex+1,endIndex,target);

        }else
            return search(arr,startIndex,midIndex -1,target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(search(arr,0,arr.length-1,5));

    }
}
