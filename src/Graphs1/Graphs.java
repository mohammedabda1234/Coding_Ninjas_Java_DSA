package Graphs1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {

    public static void dfTraversal(int[][] adjMatrix){//pre order traversal
        boolean[] visited = new boolean[adjMatrix.length];
        dfTraversal(adjMatrix,0,visited);
    }
    private static void dfTraversal(int[][] adjMatrix, int currentVertex,boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex+" ");
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentVertex][i] == 1 && visited[i] == false){
                dfTraversal(adjMatrix,i,visited);
            }
        }
    }

    public static void bfTraversal(int[][] adjMatrix){
        Queue<Integer> pending = new LinkedList<>();
        boolean[] visited = new boolean[adjMatrix.length];
        visited[0] = true;
        pending.add(0);
        while (!pending.isEmpty()){
            int currentVertex = pending.poll();
            System.out.print(currentVertex+" ");
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    pending.add(i);
                    visited[i] = true;
                }
            }
        }
    }
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
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(adjMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        dfTraversal(adjMatrix);
        System.out.println();
        System.out.println("breath first traversal");
        bfTraversal(adjMatrix);
    }
}
