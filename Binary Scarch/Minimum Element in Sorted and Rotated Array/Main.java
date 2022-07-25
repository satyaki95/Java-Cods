
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int [n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int first=0;
      int last=n-1;
      while(first<last){
        int mid=(first+last)/2;

        if(arr[mid]>arr[last]){
          first=mid+1;
        }
        else{
          last=mid;
        }
      }
      System.out.print(arr[first]);
    }
}