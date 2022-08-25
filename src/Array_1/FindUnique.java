package Array_1;

import java.util.Arrays;

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
    public static int duplicateNumber(int[] arr){
        int i,j,c;
        for(i=0;i<arr.length;i++){
            c=0;
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    c++;
            }
            if(c==2){
                return  arr[i];
            }
        }
        return 0;
    }
    static  void  print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,5,6};
        int result = duplicateNumber(arr);
        System.out.println(result);
    }
}
