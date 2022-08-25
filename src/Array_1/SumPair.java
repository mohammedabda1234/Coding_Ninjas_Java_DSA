package Array_1;

public class SumPair {
    static int sum(int[] arr,int target){
       int sumPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    sumPair+= 1;
            }
        }
        return  sumPair;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int result = sum(arr,9);
        System.out.println(result);
    }
}
