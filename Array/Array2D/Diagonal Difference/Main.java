import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[][]mat=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
            mat[i][j]=sc.nextInt();
            }
        }
          int f=0;
          int s=0;

        for(int i=0;i<a;i++)
        {
           f=f+mat[i][i];
        }

        for(int i=0;i<a;i++)
        {
            s=s+mat[a-i-1][i];
        }

        System.out.println(Math.abs(f-s));
    }
}