
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int count=0;
      Arrays.sort(arr);
      for(int i=0;i<n;i++){
        if(arr[i]==t){
          count++;
          System.out.print(i+" ");
        }
       
      }
      if(count==0){
        System.out.print("-1");
      }
    }
}