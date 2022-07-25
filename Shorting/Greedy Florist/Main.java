
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int result=0;
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
      if(k>=n){
        for(int i=0;i<n;i++){
          result+=arr[i];
        }
        System.out.println(result);
      }
      else{
         int greedy=0;
        while(n>0){
          for(int i=0;i<k;i++){
            result+=arr[n-1]*(greedy+1);
            n--;
            if(n==0){
              break;
            }
          }
          greedy++;
        }
        System.out.println(result);
      }
      
    }
}