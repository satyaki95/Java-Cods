
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
              int start=0;
        int end=n-1;
        System.out.print(findMin(arr,start,end));
    }
  static int findMin(int arr[],int low,int high){
     if (high < low) 
       return arr[0]; 
    
        if (high == low) 
          return arr[low];
    
        int mid = low + (high - low)/2;
    
        if (arr[mid+1] < arr[mid])
            return arr[mid+1];
 
        if (arr[mid] < arr[mid - 1])
            return arr[mid];
 
        if (arr[high] > arr[mid])
            return findMin(arr, low, mid-1);
        return findMin(arr, mid+1, high);
  }
}