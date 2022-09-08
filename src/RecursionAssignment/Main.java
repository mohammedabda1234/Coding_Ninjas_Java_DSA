package RecursionAssignment;

public class Main {
    public static double findGeometricSum(int k){

        if(k==0)
        {
            return 1;
        }
        double ans= (1/(Math.pow(2, k)))+findGeometricSum(k-1);
        return ans;


    }
    public static boolean isStringPalindrome(String input) {

        if(input.length()<=1)
        {
            return true;
        }
        else if(input.charAt(0)!=input.charAt(input.length()-1))
        {
            return false;
        }
        return isStringPalindrome(input.substring(1, input.length()-1));


    }
    public static int sumOfDigits(int input){
        if (input == 0)
            return 0;
        return (input % 10 + sumOfDigits(input / 10));

    }

    public static int multiplyTwoIntegers(int m, int n){
        if (m == 0 || n == 0) {
            return 0;
        } else {
            if (m == 1) {
                return n;
            } else {
                return m + (multiplyTwoIntegers(m, n - 1));
            }
        }
    }

    public static int countZerosRec(int input){//ans one
        if (input == 0) {
            return 1;
        } else if (input <= 9) {
            return 0;
        } else {
            return ((input % 10 == 0) ? 1 : 0) + countZerosRec(input / 10);
        }
    }

    public static int countZeros(int num){//ans two
        if (num == 0){//spacial case to handel zeros
            return 1;
        }
        if (num < 10){//base case
            return 0;
        }
        else if (num % 10 == 0){
            return 1 + countZeros(num/10);
        }
        return countZeros(num/10);
    }

    public static void main(String[] args) {
        System.out.println(findGeometricSum(4));
        System.out.println(isStringPalindrome("hello"));
        System.out.println(sumOfDigits(435));
        System.out.println(multiplyTwoIntegers(4,5));
        System.out.println(countZerosRec(90876));
        System.out.println(countZeros(409098708));
    }
}
