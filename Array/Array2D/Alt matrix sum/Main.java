
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int[][]mat=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        long blacksum=0;
        long whitesum=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if((i+j)%2==0)
                {
                    blacksum=blacksum+mat[i][j];
                }
                else
                {
                    whitesum=whitesum+mat[i][j];
                }
            }
        }
        System.out.println(blacksum);
        System.out.println(whitesum);



    }
}