package Recursion3;

public class Factorial {
    public static int factorial(int input){
        if (input == 0){
            return 1;
        }
        return input * factorial(input - 1);
    }
    public static void fact(int input,int answer){
        if (input == 0) {
            System.out.println(answer);
            return;
        }
        answer = answer * input;
        fact(input -1,answer);
    }
    public static void main(String[] args) {
        int input = 7;
        fact(input,1);
    }
}
