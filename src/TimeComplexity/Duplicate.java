package TimeComplexity;

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
    public static void main(String[] args) {
        int[] arr ={0 ,7 ,8,2 ,5 ,4 ,7 ,1 ,3 ,6};
        System.out.println(findDuplicate(arr));
        System.out.println(pairSum(arr,10));

    }
}
