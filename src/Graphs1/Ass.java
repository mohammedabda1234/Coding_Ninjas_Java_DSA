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

    int solve(String[] board , int n, int m)
    {
        boolean[][] visited = new boolean[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(!visited[i][j]) {
                    if(hasCycle(board,-1,-1,i,j,visited)==1) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
    public static int hasCycle(String[] board, int fromX, int fromY, int i, int j, boolean[][] visited) {

        if(visited[i][j]) {
            return 1;
        }

        int[] X_dir = {1,0,0,-1};
        int[] Y_dir = {0,1,-1,0};
        visited[i][j] = true;
        for(int l=0;l<X_dir.length;l++) {
            int x = X_dir[l] + i;
            int y = Y_dir[l] + j;
            if( x==fromX && y == fromY ) {
                continue;
            }

            if( x>=0 && y>=0 && x<board.length && y<board[x].length() && board[x].charAt(y) == board[i].charAt(j) ) {

                int ans = hasCycle(board, i, j, x, y, visited);
                if(ans == 1) {
                    return 1;
                }

            }

        }
        return 0;

    }

    public static void main(String[] args) {

    }
}
