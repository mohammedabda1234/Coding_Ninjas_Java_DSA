package Recursion3;

import java.util.Scanner;

public class Keypad {
    public static String[] keypadCombination(int input){
        if (input == 0){
            String[] out = new String[1];
            out[0] = "";
            return out;
        }
        String[] small = keypadCombination(input/10);
        int lastDigit = input%10;
        String lastDigitOptions = getOptions(lastDigit);
        String[] output = new String[small.length * lastDigitOptions.length()];

        int k = 0;
        for (int i = 0; i < small.length; i++) {
            for (int j = 0; j < lastDigitOptions.length(); j++) {
                output[k] = small[i] + lastDigitOptions.charAt(j);
                k++;
            }
        }
        return output;
    }

    private static String getOptions(int digit) {
        if (digit == 2){
           return "abc";
        }
        if (digit == 3){
            return "def";
        }
        if (digit == 4){
            return "ghi";
        }
        if (digit == 7){
            return "pqrs";
        }
        return "";
    }

    public static void printKeyPad(int input,String soFar){
        if (input == 0){
            System.out.println(soFar);
            return;
        }
        int lastDigit = input % 10;
        int small = input/10;
        String optionsLastDigit = getOptions(lastDigit);
        for (int i = 0; i < optionsLastDigit.length(); i++) {
            printKeyPad(small,optionsLastDigit.charAt(i)+soFar);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
       printKeyPad(input,"");

    }
}
