import java.util.*;
import java.io.*;

public class Main {
    public static int lastindex;  
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        lastindex = -1;
        int start = 0;
        int end = n-1;
        findLastIndexOfOne(arr,start,end);
        System.out.println(lastindex+1);
    }
        public static void findLastIndexOfOne(int [] arr, int start, int end){
            if(start>end){
                return;
            }
            int mid = (start + end)/2; 
            if(arr[mid]==1){
                //update the last index & call on the right side.
                lastindex = mid;
               findLastIndexOfOne(arr,mid+1,end);
            }
            else{
                //go to the left
               findLastIndexOfOne(arr,start,mid-1);
            }
        }
}
/*
public class Main {
    public static int ans;

    public static void findlastindex(int arr[],int start,int end){
        if(start>end)
        return;

        int mid=(start+end)/2;
        if(arr[mid]==1){
            ans=mid;
            findlastindex(arr,mid+1,end);

        }
        else{
            findlastindex(arr,start,mid-1);
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int [n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      ans=-1;
      findlastindex(arr,0,n-1);
        System.out.println(ans+1);
    }
}
/*public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int end = n-1;
        while(arr[0]==1 && end>0){
            if(arr[end]==0){
                end--;
            }
            else{
                break;
            }
        }
        if(arr[0]==0){
            System.out.println("0");
        }
        else{
            System.out.println(end+1);
        }

    }
}*/