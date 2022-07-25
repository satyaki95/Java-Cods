import java.io.*;
import java.util.*;
public class Main {
    public static void recur(int index,int n,int sum,char arr[])
    {
        // base case 
        if(index == 2*n)
        {
            if(sum==0) // third condition
            {
                // this is balanced, print
                for(int j=0;j<index;j++)
                {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
            return;
        }

        // recursive
        // two options '(' ')'
        if(sum<n) // first condition sum==n-1
        {
            arr[index] = '(';
            recur(index+1,n,(sum+1),arr);
        }
        if(sum>0) // sum>=1 // second condition
        {
            arr[index] = ')';
            recur(index+1,n,(sum-1),arr);
        }
        return;
    }
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char arr[] = new char[2*n]; // 2*n
        recur(0,n,0,arr);
    }
}