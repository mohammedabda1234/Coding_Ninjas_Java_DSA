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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String[] output = keypadCombination(input);
        for (String out : output){
            System.out.println(out);
        }

    }
}
