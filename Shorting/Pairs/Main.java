import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]-arr[j]==k || arr[j]-arr[i]==k)
                {
                    c++;
                }
            }
        }

        System.out.println(c);
    }
}