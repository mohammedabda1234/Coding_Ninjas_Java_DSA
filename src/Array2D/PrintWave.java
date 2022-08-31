package Array2D;
public class PrintWave {
    public static void wavePrint(int[][] mat){
        if (mat.length == 0)
        {
            System.out.print("");
        }
        else
        {
            for (int i=0;i<mat[0].length;i++)
            {
                if (i % 2 == 0)
                {
                    for (int j=0;j<mat.length;j++)
                    {
                        System.out.print(mat[j][i] + " ");
                    }
                }
                else
                {
                    for (int j=mat.length-1;j>=0;j--)
                    {
                        System.out.print(mat[j][i] + " ");
                    }
                }
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
        int[][] nums = {{4,6,3},{3,1,2},{5,9,0}};
        print2D(nums);
        wavePrint(nums);
    }
}
