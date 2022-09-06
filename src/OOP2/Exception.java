package OOP2;

public class Exception {
    public static int fact(int n) throws NegativeNumber {
        if (n < 0){
            throw new NegativeNumber();
        }
        int ans = 1;
        for (int i = 2; i <= n ; i++) {
            ans = ans * i;
        }
        return  ans;
    }
    public static int div(int a,int b) throws DividedByZero {
        if (b == 0){
            throw new DividedByZero();
        }
        return a/b;
    }
    public static void main(String[] args)  {
        String s = null;
//        System.out.println(s.length());//error
//        System.out.println(4/0);
        try {
            div(5,3);
            System.out.println(fact(-1));
        } catch (DividedByZero e) {
            System.out.println("divided by zero not allowed ");
//            throw new RuntimeException(e);
        } catch (NegativeNumber e) {
            System.out.println("negative number");
//            throw new RuntimeException(e);
        }
        System.out.println("Main");

    }
}
