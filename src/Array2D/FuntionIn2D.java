package Array2D;

import java.util.Scanner;

public class FuntionIn2D {
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
        int[][] arr = takeInput();
        print2D(arr);
    }
}
