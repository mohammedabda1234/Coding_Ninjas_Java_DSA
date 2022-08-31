package Array2D;

public class RowSum {
    public static void sum(int[][] arr){
        int rSum ;
        for (int i = 0; i < arr.length; i++) {
            rSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rSum+= arr[i][j];
            }
            System.out.print(rSum +" ");
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{7,5,3},{6,5,2}};
        sum(arr);
    }
}
