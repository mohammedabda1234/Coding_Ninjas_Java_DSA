package Recurion1;

public class Calculate {
    public static int count(int num){
        if ((num/10) == 0){
            return 1;
        }
        return  1 + count(num/10);

    }
    public static int power(int x,int n){
        if (n == 0){
            return 1;
        }
        return x * power(x,n -1);
    }
    public static void printN(int num){
        if (num == 0){
            return;
        }
        printN(num - 1);
        System.out.print(num+" ");
    }

    public static int fib(int num){
        if (num == 1 || num == 2){
            return 1;
        }
        int first = fib( num - 1);
        int second = fib(num - 2);
        return first + second;
    }
    public static void main(String[] args) {
//        System.out.println(power(2,8));
//        System.out.println(count(1090));
//        printN(10);
        System.out.println(fib(8));
    }
}
