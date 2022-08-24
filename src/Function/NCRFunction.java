package Function;

import java.util.Scanner;

public class NCRFunction {
    public static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n - r);
        int result = factN / (factR * factNR);
        System.out.println(result);
    }
}
