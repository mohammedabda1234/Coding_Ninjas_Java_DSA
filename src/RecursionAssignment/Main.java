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

    public static String addStars(String s) {
        if(s.length()==1)
            return s;
        String smallans=addStars(s.substring(1));
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
    }

    public static boolean checkAB(String input) {
        if(input.length() == 0){
            return true;
        }

        if(input.charAt(0) == 'a'){
            if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){
                return checkAB(input.substring(3));
            }else{
                return checkAB(input.substring(1));
            }
        }
        return false;
    }

    public static long staircase(int n){

        long storage[]=new long[n+1];
        storage[0]=1;
        storage[1]=1;
        for(int i=2;i<storage.length;i++) {
            long op2=0,op3=0;
            long op1=storage[i-1];
            if(i-2>=0)
                op2=storage[i-2];
            if(i-3>=0)
                op3=storage[i-3];
            storage[i]=op1+op2+op3;
        }
        return storage[n];


    }
    public static void main(String[] args) {
        System.out.println(findGeometricSum(4));
        System.out.println(isStringPalindrome("hello"));
        System.out.println(sumOfDigits(435));
        System.out.println(multiplyTwoIntegers(4,5));
        System.out.println(countZerosRec(90876));
        System.out.println(countZeros(409098708));
        System.out.println(addStars("hello"));
        System.out.println(checkAB("abb"));
        System.out.println(staircase(5));
    }
}
