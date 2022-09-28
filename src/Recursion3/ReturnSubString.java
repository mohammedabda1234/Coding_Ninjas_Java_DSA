package Recursion3;

import java.util.Scanner;

public class ReturnSubString {
    public static String[] subSequence(String input){
        if (input.length() == 0){//base case
           String[] out = new String[1];
           out[0] = "";
            return out;
        }
        String[] small = subSequence(input.substring(1));
        String[] outPut = new String[small.length * 2];
        for (int i = 0; i < small.length; i++) {
            outPut[i] = small[i];
        }
        for (int i = 0; i < small.length; i++) {
            outPut[small.length + i] = input.charAt(0) + small[i];
        }
        return outPut;
    }
    public static void printSubsequence(String input,String soFar){
        if (input.length() == 0){
            System.out.println(soFar);
            return;
        }
        String small = input.substring(1);
        printSubsequence(small,soFar);
        printSubsequence(small,soFar+input.charAt(0));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        printSubsequence(str,"");
    }
}
