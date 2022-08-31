package Array2D;

import java.util.Scanner;

public class InputAndPrinting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = s.nextInt();
        System.out.println("Enter number of columns");
        int col = s.nextInt();
        int[][] arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element of rows "+(i+1)+" columns "+(j+1));
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("our array is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("|"+arr[i][j]+"");
            }
            System.out.println();
        }
    }
}
