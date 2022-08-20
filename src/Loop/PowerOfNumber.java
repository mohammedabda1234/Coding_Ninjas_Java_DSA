package Loop;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = 1;
        while (exponent != 0){
            result*= base;
            --exponent;
        }
        System.out.println(result);
    }
}
