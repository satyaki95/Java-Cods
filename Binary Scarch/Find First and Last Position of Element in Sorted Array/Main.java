
import java.util.*;
import java.io.*;

public class Main {
  public static int first=-1;
  public static int second=-1;
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      int target=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int low=0;
      int high=n-1;
      
       firstindex(arr,low,high,target);
       lastindex(arr,low,high,target);
      System.out.println(first+" "+second);
      
    }
  public static void firstindex(int arr[],int l,int h,int t){
    int mid=(l+h)/2;
   if(l>h){
     return;
   }
    if(arr[mid]==t){
      first=mid;
      firstindex(arr,l,mid-1,t);
    }
    else if(arr[mid]<t){
      firstindex(arr,mid+1,h,t);
    }
    else{
      firstindex(arr,l,mid-1,t);
    }
  }

    public static void lastindex(int arr[],int l,int h,int t){
   if(l>h){
     return;
   }
      int mid=(l+h)/2;
    if(arr[mid]==t){
      second=mid;
      lastindex(arr,mid+1,h,t);
    }
    else if(arr[mid]<t){
      lastindex(arr,mid+1,h,t);
    }
    else{
      lastindex(arr,l,mid-1,t);
    }
  }
}