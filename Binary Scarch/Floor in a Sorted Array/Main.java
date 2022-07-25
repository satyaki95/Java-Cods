import java.util.*;
import java.io.*;

public class Main {
    public static int ans = -1;
    public static void main(String args[]) {
        //your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int [] arr = new int[n];
        int start =0;
        int end = n-1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        binarysearch(arr,start,end,x);
        System.out.println(ans);

    }
    public static void binarysearch(int [] arr, int start,int end,int x){
     if(start>end){
         return;
     }
     int mid = (start + end)/2;
     if(arr[mid]<=x){
         ans = mid;
         binarysearch(arr,mid+1,end,x);
     }
     else{
       binarysearch(arr,start,mid-1,x);
     }
       return;
   }
}