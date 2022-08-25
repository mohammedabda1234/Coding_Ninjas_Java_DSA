package Array_1;

public class FindUnique {
    public static int find(int[] arr){
        int count ;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
               if (arr[i] == arr[j])
                   count++;
            }
            if (count == 1)
                return  arr[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,5,6};
        int result = find(arr);
        System.out.println(result);
    }
}
