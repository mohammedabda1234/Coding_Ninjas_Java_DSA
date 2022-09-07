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
    public static void main(String[] args) {
        System.out.println(power(2,8));
        System.out.println(count(1090));
    }
}
