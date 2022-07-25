
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int min,temp=0;
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
        min=i;
        for(int j=i+1;j<n;j++){
          if(arr[j]<arr[min]){
            min=j;
          }
        }
        temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
      }
     if(n%2!=0){
       System.out.print(arr[n/2]);
     }
      else{
        System.out.print((arr[(n-1)/2]+arr[n/2])/2);
      }
    }
}