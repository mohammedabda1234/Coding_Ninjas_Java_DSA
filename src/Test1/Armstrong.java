package Test1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N = s.nextInt();
        int count=0;
        int rem=0;
        int i;
        double power=0;
        int temp=N;
        while(temp!=0)
        {

            temp=temp/10;
            count++;
        }

        int k=N;
        for(i=1;i<=count ;i++)
        {
            rem=k%10;
            power=power+Math.pow(rem,count);
            k=k/10;
        }
        if((int)power==N)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
