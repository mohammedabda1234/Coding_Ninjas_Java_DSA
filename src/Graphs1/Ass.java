package Graphs1;

public class Ass {

    public static void helpDFS(int edges[][],boolean visited[],int start, int n){
        //mark visited as true
        visited[start]=true;
        //go through all the adjacent vertices of start vertex which have value 1 in the adjacency matrix
        for(int j=0;j<n;j++){
            if(edges[start][j]==1&&!visited[j]){
                helpDFS(edges,visited,j,n);
            }
        }
    }

    public static int numConnected(int[][] edges, int n) {

        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            //if the vertex is not visted call dfs on the vertex
            if(!visited[i]){
                //after 1st call mark count = count+1;
                count++;
                helpDFS(edges,visited,i,n);

            }
        }
        return count; //this returns the final number of times helpDFS was called, that is number of coonected components/islands

    }
    public static void main(String[] args) {

    }
}
