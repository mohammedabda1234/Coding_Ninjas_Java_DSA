package Loop;

import java.util.Scanner;

public class SumOfEvenAndodd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int odd = 0,even = 0,digit;
        while (n > 0){
            digit = n % 10;
            n = n / 10;
            if (digit % 2 == 0){
                even = even + digit;
            }
            else {
                odd = odd + digit;
            }
        }
        System.out.println(even +" "+odd);
    }
}
