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
    public static int findTriplet(int[] arr, int target) {
        int supTriplet = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        supTriplet+= 1;
                }
            }
        }
        return supTriplet;
    }

        public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        int result = findTriplet(arr,20);
        System.out.println(result);
    }
}
