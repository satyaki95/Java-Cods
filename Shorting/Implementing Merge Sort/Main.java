
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      int start =0;
      int end = n-1;
      MergeSort(arr,start,end);
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
      }
      
      
    }
  public static void MergeSort(int [] arr,int start, int end){
    if(start>=end){
      return;
    }
    int mid = (start + end)/2;

    MergeSort(arr,start,mid);  //left
    MergeSort(arr,mid+1,end);  //right
    Merge(arr,start,end);      //merge
    
  }
  public static void Merge(int [] arr,int start, int end){
    int mid = (start+ end)/2;
    int i = start;
    int j = mid+1;
    int k =0;
    int [] temp = new int[end-start+1];
    while(i<=mid && j<=end){
      if(arr[i]<=arr[j]){
        temp[k++] = arr[i];
        i++;
      }
      else{
        temp[k++] = arr[j];
        j++;
      }
    }
    while(i<=mid){
      temp[k++] = arr[i++];
    }
    while(j<=end){
      temp[k++] = arr[j++];
    }
    k =0;
    for(int p = start;p<=end;p++){
      arr[p] = temp[k++];
    }
    
  }
}