
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int d=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
     Arrays.sort(arr);
      int count=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          for(int k=j+1;k<n;k++){
            int dif=arr[k]-arr[i];
            if(dif<=d){
              count++;
            }
          }
        }
      }
      System.out.println(count);
    }
}