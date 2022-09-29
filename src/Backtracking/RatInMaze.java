package Backtracking;

public class RatInMaze {
    public static boolean ratInMaze(int[][] maze){
        int n = maze.length;
        int[][] path = new  int[n][n];
        return solveMaze(maze,0,0,path);
    }

    private static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        // check valid cells i j
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        // include cell in current path
        path[i][j] = 1;
        //destination cell
        if (i == n -1 && j == n -1){
            return true;
        }
        //explore all direction
        //top
        if (solveMaze(maze,i-1,j,path)){
            return true;
        }
        //right
        if (solveMaze(maze,i,j+1,path)){
            return true;
        }
        //down
        if (solveMaze(maze,i+1,j,path)){
            return true;
        }
        //left
        if (solveMaze(maze,i,j-1,path)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
        boolean path = ratInMaze(maze);
        System.out.println(path);
    }
}
