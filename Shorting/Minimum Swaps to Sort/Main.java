import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int temp=0,count=0;
      for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
          if(arr[min]>arr[j]){
            min=j;
          }
        }
      for(int k=i+1;k<n;k++){
         if(arr[i]>arr[k]){
          temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
        count++;
       }
      }
      }
      System.out.println(count);
    }
}