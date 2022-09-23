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
    public static void main(String[] args) {

    }
}
