package Array2D;

import java.util.Scanner;

public class LargestRowOrColumn {
    public static void findLargest(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        int num = 0;
        boolean Row = true;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j <col ; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > largest){
                largest = rowSum;
                num =i;
            }
        }
        for (int j = 0; j < col; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum+= arr[i][j];
            }
            if (colSum>largest){
                largest = colSum;
                num = j;
                Row = false;
            }

        }
        if (Row){
            System.out.println("row "+num+" " +largest);
        }
        else
            System.out.println("columns "+num+" "+largest);

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
    public static void  print2D(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("|"+arr[i][j]+" ");
                System.out.print("|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] nums = takeInput();
        print2D(nums);
        findLargest(nums);
    }
}
