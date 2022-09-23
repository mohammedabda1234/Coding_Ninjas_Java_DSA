package Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class Unique {
    public static String uniqueChar(String str){

        if(str.length()==0) {
            return "";
        }
        String ans = "";
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int currentIndex=0;currentIndex<str.length();currentIndex++) {
            char currentChar = str.charAt(currentIndex);
            if(!map.containsKey(currentChar)) {
                map.put(currentChar, true);
                ans += currentChar;
            }
        }
        return ans;
    }
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++)
        {
            map.put(arr[i],1);
        }

        int overallcount=0,maxStart=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {

            if(!map.containsKey(arr[i]-1))
            {
                int currentcount = 1;
                int currentstart = arr[i];

                while(map.containsKey(currentstart+1))
                {
                    currentcount++;
                    currentstart=currentstart+1;
                }
                if(currentcount>overallcount)
                {
                    overallcount=currentcount;
                    maxStart = arr[i];
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(maxStart);
        ans.add(maxStart+overallcount-1);

        return ans;

    }
    public static int getPairsWithDifferenceK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairCount = 0;
        for(int item:arr)
        {
            int p1 = item + k;
            boolean flag = false;
            if(item == p1)
            {
                flag = true; //this case is there for k=0
            }
            if(map.containsKey(p1))
            {
                pairCount += map.get(p1);
            }
            int p2 = item - k;
            if(map.containsKey(p2) && !flag)
            {
                pairCount += map.get(p2);
            }
            if(map.containsKey(item)) {
                map.put(item, map.get(item)+1);
            }else {
                map.put(item, 1);
            }
        }
        return pairCount;
    }
    public static void main(String[] args) {

    }
}
