package Graphs1;

import java.util.Scanner;

public class Graphs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int e = s.nextInt();
        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < e; i++) {
            int V1 = s.nextInt();
            int V2 = s.nextInt();
            adjMatrix[V1][V2] = 1;
            adjMatrix[V2][V1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
