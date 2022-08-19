package Introduction;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println(c);
    }
}
