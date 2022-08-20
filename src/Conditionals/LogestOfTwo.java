package Conditionals;

import java.util.Scanner;

public class LogestOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = s.nextInt();
        int b = s.nextInt();
        if (a > b){
            System.out.println(a +" Greater than "+b);
        }else {
            System.out.println(b +"Greater than "+a);
        }
    }
}
