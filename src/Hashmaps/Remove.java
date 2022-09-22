package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,3,4,5,6,7,8,9,9,9,};
        ArrayList<Integer> out = removeDuplicate(arr);
        System.out.println(out);
    }

    private static ArrayList<Integer> removeDuplicate(int[] arr) {
        ArrayList<Integer> out = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                continue;
            }
            out.add(arr[i]);
            map.put(arr[i],true );
        }
        return out;
    }

}
