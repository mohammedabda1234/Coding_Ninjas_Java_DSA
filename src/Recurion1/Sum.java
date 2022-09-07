package Recurion1;

public class Sum {
    public static int sum(int[] arr,int n){
        if (n == 0){
            return 0;
        }
        return (sum(arr,n-1)+arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sum(arr,arr.length ));
//        System.out.println(sum(arr));
    }

//    public static int sum(int input[]) {
//        return sum1(input,0);
//
//    }
//    private static int sum1(int input[],int startIndex){
//        if(startIndex==input.length)
//            return 0;
//        int ans=input[startIndex]+sum(input,startIndex+1);
//        return ans;

//    }
}
