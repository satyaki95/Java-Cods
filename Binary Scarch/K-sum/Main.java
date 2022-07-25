
import java.util.*;
import java.io.*;

public class Main {
    public static boolean isValid(int[] arr,int mid,int n,int k){

        int sum = 0,i;
        for(i=0;i<n;i++){

            int quo = arr[i]/mid;
            int rem = arr[i]%mid;
            if(rem!=0){
                quo++;
            }
            sum = sum + quo;
        }
        if(sum<=k){
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int i;
        int mini = 1,maxi = 0;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            maxi = Math.max(arr[i],maxi);
        }
        int s = 1,e = maxi;
        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            boolean val = isValid(arr,mid,n,k);

            if(val==true){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }

        }

        System.out.println(ans);
    }
}