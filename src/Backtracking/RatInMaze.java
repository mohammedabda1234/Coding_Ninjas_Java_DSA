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
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(path[k][l]+" ");
                }
                System.out.println();
            }
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


    static void printSolution(int[][] solution, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void solveMaze(int maze[][], int solution[][], int x, int y, int n)
    {
        if (x == n - 1 && y == n - 1)
        {
            solution[x][y] = 1;
            printSolution(solution, n);
            System.out.println();
            return;
        }
        if (x > n - 1 || x < 0 || y > n - 1 || y < 0)
        {
            return;
        }
        if (x > n - 1 || x < 0 || y > n - 1 || y < 0 || maze[x][y] == 0 || solution[x][y] == 1)
        {
            return;
        }
        solution[x][y] = 1;
        solveMaze(maze, solution, x - 1, y, n);
        solveMaze(maze, solution, x + 1, y, n);
        solveMaze(maze, solution, x, y - 1, n);
        solveMaze(maze, solution, x, y + 1, n);
        solution[x][y] = 0;
    }

    static void ratInAMaze(int maze[][], int n)
    {
        int[][] solution = new int[20][20];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                solution[i][j] = 0;
            }
        }
        solveMaze(maze, solution, 0, 0, n);
    }
    public static void main(String[] args) {
        int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
//        boolean path = ratInMaze(maze);
//        System.out.println(path);
        int n = maze.length;
        printSolution(maze,n);
    }
}
