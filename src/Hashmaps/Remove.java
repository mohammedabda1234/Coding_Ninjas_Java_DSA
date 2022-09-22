package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove {
    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int item:arr) {
            //we are going through each item of the array and put its frequency as value .and item in array as key
            if(hashMap.containsKey(item)) {
                hashMap.put(item, hashMap.get(item)+1);
            }else {
                hashMap.put(item, 1);
            }
            //hashMap.put(item, hashMap.getOrDefault(item, 0)+1)
        }
        int max = 0, ans = Integer.MIN_VALUE;
        for(int item:arr)
        {
            if(hashMap.get(item) > max)
            {
                max = hashMap.get(item);
                ans = item;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,3,4,5,6,7,8,9,9,9,};
        ArrayList<Integer> out = removeDuplicate(arr);
        System.out.println(out);
        System.out.println(maxFrequencyNumber(arr));
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
