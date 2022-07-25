import java.util.*;
import java.io.*;

public class Main {
    static int recur(int n,int start)
    {
        if(n==0)
        {
            return 1;
        }

        int ans = 0;
        for(int i=start;i<=n;i++)
        {
            ans += recur(n-i,i+1);
        }

        return ans;
    }
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = recur(n,1);
        System.out.println(ans);
    }
}