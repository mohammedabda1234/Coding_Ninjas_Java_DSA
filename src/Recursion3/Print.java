package Recursion3;

public class Print {
    public static void printSubsets(int input[]) {
        // Write your code here
        printSubsetsHelper(input,0,new int[0]);
    }

    private static void printSubsetsHelper(int[] input, int startIndex, int[] output)
    {
        //Base case  - If start index = input.length, print the output and return
        if (startIndex==input.length)
        {
            for (int i=0;i<output.length;i++)
            {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        //Case one, output contains element of input array at startIndex
        int[] newOutput = new int[output.length+1];
        for (int i=0;i<output.length;i++)
        {
            newOutput[i]=output[i];
        }
        newOutput[output.length]=input[startIndex];
        printSubsetsHelper(input,startIndex+1,newOutput);
        //Case 2, output does not contain element of input array at startIndex
        printSubsetsHelper(input,startIndex+1,output);
    }
    public static void printSubsetsSumTok(int input[], int k) {
        // Write your code here
        int[][] output = subsetsSumKHelper(input,k,0);
        for (int i=0;i<output.length;i++)
        {
            int[] arr = output[i];
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }


    private static int[][] subsetsSumKHelper(int input[], int k, int startIndex)
    {
        //Base case - If startIndex == input.length
        //We can have two cases in the base condition
        //1. If k==0 - This means the desired sum has been achieved by including the last element of the input array
        //2. If k!=0 - Desired sum has not been achieved even when last element is included
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
    public static void main(String[] args) {

    }
}
