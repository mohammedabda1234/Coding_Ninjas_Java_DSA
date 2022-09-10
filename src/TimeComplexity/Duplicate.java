package TimeComplexity;

import java.util.Arrays;

public class Duplicate {
    public static int findDuplicate(int[] arr) {
        int n=arr.length-2;
        int sum=0;
        for(int i : arr) {
            sum+=i;
        }
        return sum-(n*(n+1)/2);
    }
    public static int pairSum(int[] arr, int num) {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]+arr[j]==num)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int tripletSum(int[] arr, int num) {

        Arrays.sort(arr);
        int n = arr.length;

        int numTriplets = 0;

        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;

            int start = i + 1;
            int stop = n - 1;

            while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                    if (arr[start] == arr[stop]) {
                        int totalCount = (stop - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }

                    int tempI = start + 1;
                    int tempJ = stop - 1;

                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }

                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }

                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;

                    numPairs += (totalElementFromStart * totalElementFromEnd);

                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;

    }
    public static void main(String[] args) {
        int[] arr ={0 ,7 ,8,2 ,5 ,4 ,7 ,1 ,3 ,6};
        System.out.println(findDuplicate(arr));
        System.out.println(pairSum(arr,10));
        System.out.println(tripletSum(arr,20));

    }
}
