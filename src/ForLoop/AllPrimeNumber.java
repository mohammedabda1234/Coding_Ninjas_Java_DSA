package ForLoop;

import java.util.Scanner;

public class AllPrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean isPrime;
        int i, j;
        for (i = 2; i < n; i++) {
            isPrime = false;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println(i);
            }
        }
    }
}
