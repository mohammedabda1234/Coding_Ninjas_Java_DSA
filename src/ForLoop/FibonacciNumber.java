package ForLoop;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = 0,n2 = 1,n3;
        for (int i = 2; i <= n ; i++) {
            n3 = n1+n2;
            System.out.println(n3);// to print all value of fib series
            n1 = n2;
            n2 = n3;
        }
    }
}
