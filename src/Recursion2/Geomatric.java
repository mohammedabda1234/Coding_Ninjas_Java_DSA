package Recursion2;

public class Geomatric {
    public static double findGeometricSum(int k){

        if(k==0)
        {
            return 1;
        }
        double ans= (1/(Math.pow(2, k)))+findGeometricSum(k-1);
        return ans;


    }
    public static void main(String[] args) {
        System.out.println(findGeometricSum(4));
    }
}
