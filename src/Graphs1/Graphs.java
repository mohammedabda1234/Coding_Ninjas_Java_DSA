package Graphs1;

import java.util.*;

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
    public static ArrayList<Integer> getPathDFS(int[][] edges,boolean[] visited,int V1,int V2){
        if(V1==V2)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            visited[V1]=true;
            ans.add(V1);
            return ans;
        }
        visited[V1]=true;
        for(int i=0;i<edges.length;i++)
        {
            if(edges[V1][i]==1 && !visited[i])
            {
                ArrayList<Integer> arr=getPathDFS(edges,visited,i,V2);
                if(arr!=null)
                {
                    arr.add(V1);

                    return arr;
                }
            }
        }
        return null;
    }

    public static ArrayList<Integer> getPathBFS(int[][] adjMatrix,int s,int e) {
        Queue<Integer> pending = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean[] visited = new boolean[adjMatrix.length];
        visited[s] = true;
        pending.add(s);
        map.put(s, -1);
        boolean pathFound = false;
        while (!pending.isEmpty()) {
            int currentVertex = pending.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    pending.add(i);
                    visited[i] = true;
                    map.put(i, currentVertex);
                    if (i == e) {
                        //path found
                        pathFound = true;
                        break;
                    }
                }
            }
            if (pathFound) {
                ArrayList<Integer> path = new ArrayList<>();
                int Vertex = e;
                while (Vertex == -1) {
                    path.add(Vertex);
                    int parent = map.get(Vertex);
                    Vertex = parent;
                }
                return path;
            } else {
                return null;
            }
        }
    return null;
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
