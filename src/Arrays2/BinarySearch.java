package Arrays2;

public class BinarySearch {
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = (start + end) /2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid]>target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return  -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,5,10,20,30,40};
        int n = search(arr,2);
        System.out.println(n);
    }
}
