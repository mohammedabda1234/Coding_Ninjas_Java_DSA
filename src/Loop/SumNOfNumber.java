package Loop;

import java.util.Scanner;

public class SumNOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;// to sum of result
        int i = 1;//next number to be added
        while (i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
