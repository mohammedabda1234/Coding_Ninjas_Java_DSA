package Hashmaps;

import java.util.HashMap;

public class ArrayInter {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5,6,3,2,5,0};
        int[] arr2 = {5,6,8,9,2,3,0,1};
        printIntersection(arr1,arr2);
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])){
                int value = map.get(arr1[i]);
                map.put(arr1[i],value+1);
            }else {
                map.put(arr1[i],1 );
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i])){
                int frequ = map.get(arr2[i]);
                if (frequ > 0){
                    System.out.print(arr2[i]+" ");
                    map.put(arr2[i],frequ -1 );
                }
            }
        }
    }
}
