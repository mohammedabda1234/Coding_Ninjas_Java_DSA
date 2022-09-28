package Recursion3;

public class Minimum {
    public static int findMin(int[] arr,int startIndex){
        if (startIndex == arr.length){
            return Integer.MAX_VALUE;
        }
        int minSmall = findMin(arr,startIndex +1);
        if (arr[startIndex] < minSmall){
            return arr[startIndex];
        }else {
            return minSmall;
        }
    }
    public static void printMin(int[] arr) {
        int min = findMin(arr,0);
        System.out.println(min);

    }

    public static void printMin(int[] arr,int startIndex,int minSoFar ){
        if (startIndex == arr.length){
            System.out.println(minSoFar);
            return;
        }
        int newMin = minSoFar;
        if (arr[startIndex] < minSoFar){
            newMin = arr[startIndex];
        }
        printMin(arr,startIndex+1,newMin);
    }
    public static void main(String[] args) {
        int[] arr = {4,8,7,9,0};
        printMin(arr,0,Integer.MAX_VALUE);

//        int result = findMin(arr,0);
//        System.out.println(result);
//        printMin(arr);
    }
}
