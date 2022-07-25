
import java.util.*;
import java.io.*;

public class Main {

    public static int ans;

    public static long getWood(int height[], int x){
        int n = height.length;
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.max(height[i]-x,0);
        }
        return sum;
    }

    public static void search(int height[], int start, int end, int k){
        // base case
        if(start>end)
            return;

        int mid = (start+end)/2;
        // check the wood collected for mid
        long wc = getWood(height,mid);
        if(wc<=k){
            ans = mid;
            // go left
            search(height,start,mid-1,k);
        }
        else{
            // go right
            search(height,mid+1,end,k);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int height[] = new int[n];
        int maxHeight = 0;
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
            maxHeight = Math.max(maxHeight,height[i]);
        }
        ans = maxHeight;
        search(height,0,maxHeight,k);
        System.out.println(ans);
    }
}
