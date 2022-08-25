package Array_1;

public class Intersection {
    public static  void  inter(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    System.out.println(arr1[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2,5,6,9};
        int[] arr2 = {5,6,8,9,};
        inter(arr1,arr2);
    }
}
