package Conditionals;

public class LogicalOperations {
    public static void main(String[] args) {
        int a = 10,b  = 30;
        // relation statement
//        System.out.println(a > b);//Greater than
//        System.out.println(a < b);//less than
//        System.out.println(a == b);// equal
//        System.out.println(a != b);// not equal
//        System.out.println(a >= b);//Greater than or equal
//        System.out.println(a <= b);//less than or equal

        //logical
        System.out.println(a >= 10 && b > 10);// And
        System.out.println(a > 10 || b > 10);// OR
        System.out.println(!(a>b));// not

    }
}
