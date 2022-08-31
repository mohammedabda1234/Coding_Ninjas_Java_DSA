package Array2D;

import java.util.Scanner;

public class LargestSumCol {
    public static int largestSum(int[][] arr){
        int rows = arr.length;
        int col = arr[0].length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum = sum + arr[j][i];
            }
            if (sum > largest){
                largest = sum;
            }
        }
        return  largest;
    }
    public static int[][] takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        System.out.println("Enter number of columns");
        int col = s.nextInt();
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter row no "+(i+1)+" columns no "+(j+1));
                arr[i][j] = s.nextInt();
            }
        }
        return  arr;
    }
    public static void main(String[] args) {
        int[][] arr = takeInput();
        int result = largestSum(arr);
        System.out.println(result);
    }
}
