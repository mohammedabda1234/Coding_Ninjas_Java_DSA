package Recursion3;

public class Sum {
    // Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int input[], int k) {
        // Write your code here
        return subsetsSumKHelper(input,k,0);
    }
    private static int[][] subsetsSumKHelper(int input[], int k, int startIndex)
    {
        if (startIndex==input.length)
        {
            int arr[][];
            if (k==0)
            {
                arr = new int[1][0];
            }
            else
            {
                arr = new int[0][0];
            }
            return arr;
        }
        //Considering recursive hypothesis where we have the subsets of two cases
        //1. Subsets containing current input[startIndex] element - temp1
        //2. Subsets not containing current input[startIndex] element - temp2
        int temp1[][] = subsetsSumKHelper(input,k-input[startIndex],startIndex+1);
        int temp2[][] = subsetsSumKHelper(input,k,startIndex+1);
        //Now, we simply need to combine temp1 and temp2 and return to the calling function
        //When copying temp1 into output, we need to ensure we also include current input[startIndex] as the first element of that row
        int output[][] = new int[temp1.length+temp2.length][];
        for (int i=0;i<temp2.length;i++)
        {
            output[i] = new int[temp2[i].length];
            for (int j=0;j<temp2[i].length;j++)
            {
                output[i][j]=temp2[i][j];
            }
        }
        for (int i=0;i<temp1.length;i++)
        {
            output[i+temp2.length] = new int[temp1[i].length+1];
            output[i+temp2.length][0] = input[startIndex];
            for (int j=1;j<output[i+temp2.length].length;j++)
            {
                output[i+temp2.length][j]=temp1[i][j-1];
            }
        }
        return output;
    }

    public static int[][] subsets(int input[]) {
        // Write your code here
        return subsetsHelper(input,0);
    }

    private static int[][] subsetsHelper(int[] input, int startIndex)
    {
        if (startIndex==input.length)
        {
            return new int[1][0];
        }
        int[][] temp = subsetsHelper(input, startIndex+1);
        //System.out.println("Length of 2D matrix: "+temp.length);
        int[][] smallOutput = new int[temp.length*2][];

        for (int i=0;i<temp.length;i++)
        {
            smallOutput[i] = new int[temp[i].length];
            int[] smallTemp = temp[i];
            for (int j=0;j<temp[i].length;j++)
            {
                smallOutput[i][j]=smallTemp[j];
            }
        }

        for (int i=0;i<temp.length;i++)
        {
            smallOutput[i+temp.length] = new int[temp[i].length+1];
            smallOutput[i+temp.length][0]=input[startIndex];
            int[] smallTemp = temp[i];
            for (int j=1;j<=temp[i].length;j++)
            {
                smallOutput[i+temp.length][j]=smallTemp[j-1];
            }
        }

        return smallOutput;
    }
    public static void main(String[] args) {

    }
}
