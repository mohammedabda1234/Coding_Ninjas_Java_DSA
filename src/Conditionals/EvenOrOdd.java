package Conditionals;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int a = s.nextInt();
        if (a % 2 == 0){
            System.out.println("the number is Even");
        }else {
            System.out.println("Ther number is Odd");
        }
    }
}
