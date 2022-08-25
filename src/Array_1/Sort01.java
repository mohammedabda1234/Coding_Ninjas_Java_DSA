package Array_1;

public class Sort01 {
    public static void sortZeroesAndOne(int[] arr) {
        int countZeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                countZeros++;
        }
        for (int i = 0; i < countZeros; i++) {
            arr[i] = 0;
        }
        for (int i = countZeros; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1};
        sortZeroesAndOne(arr);
        print(arr);
    }
}
