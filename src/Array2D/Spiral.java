package Array2D;

public class Spiral {
    public static void spiral(int[][] nums){
        int row = nums.length;
        int col = nums[0].length;
        int i,k = 0,l = 0;
        while (k < row && l < col){
            for (i = l;i<col;i++){// left to right
                System.out.print(nums[k][i]+" ");
            }
            k++;
            for (i = k;i<row;i++){// top to bottom
                System.out.print(nums[i][col -1]+" ");
            }
            col--;
            if (col < row){
                for (i = col -1;i>=l;i--){// right to left
                    System.out.print(nums[row - 1][i]+" ");
                }
                row--;
            }
            if (l < col){
                for (i = row -1;i>=k;i--){//bottom to top
                    System.out.print(nums[i][l]+" ");
                }
                i++;
            }
        }
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
        int[][] arr = {{1,2,3},{6,4,3},{9,6,3}};
        print2D(arr);
        spiral(arr);
    }
}
