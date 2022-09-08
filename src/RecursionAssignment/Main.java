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
    public static void main(String[] args) {
        System.out.println(findGeometricSum(4));
        System.out.println(isStringPalindrome("hello"));
        System.out.println(sumOfDigits(435));
    }
}
