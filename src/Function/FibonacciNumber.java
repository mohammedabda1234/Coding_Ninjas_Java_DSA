package Function;

public class FibonacciNumber {
    public static boolean checkMember(int n) {
        int x = 0;
        int y = 1;
        int sum = 0;
        boolean isTrue = true;

        for (int i = 1; i <= n; i++) {
            x = y;
            y = sum;
            sum = x + y;
            if (sum == n) {
                isTrue=true;
                break;
            } else {
                isTrue=false;
            }
        }
        return isTrue;
    }
    public static void main(String[] args) {
        boolean isTrure  = checkMember(21);
        System.out.println(isTrure);
    }
}
