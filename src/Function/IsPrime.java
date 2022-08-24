package Function;

public class IsPrime {
    public  static  boolean checkPrime(int n){
        int div = 2;
        while (div <= n / 2){
            if (n % div == 0) {

                return  false;
            }
            div++;
        }
        return  true;
    }
    public static void main(String[] args) {
        int n = 13;
        boolean check = checkPrime(n);
        System.out.println(check);
    }
}
