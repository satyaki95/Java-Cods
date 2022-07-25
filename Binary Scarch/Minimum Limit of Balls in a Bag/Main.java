
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
       Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int [] arr = new int[n];
      int penaltyMax = Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
          penaltyMax = Math.max(arr[i],penaltyMax);
      }
      int ans = -1;
      int start = 1;
      int end = penaltyMax;

      while(start<=end){
          int operations =0;
          int mid = (start+end)/2;
          for(int i=0;i<n;i++){
              operations+= (arr[i]-1)/mid;
          }
          if(operations<=m) {
              ans = mid;
              end = mid-1;
          }
          else{
              start = mid+1;
          }
      }
        System.out.println(ans);

    }
}