
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        int ans = search(arr,start,end,key);
        System.out.println(ans);
    }
        public static int search(int [] arr,int start, int end,int key){

            int mid = (start + end)/2;
            if(start>end){
                return -1;
            }
            if(arr[mid]==key){
                return mid;
            }
            if(arr[start]<=arr[mid]){    // left part sorted
              if(key>=arr[start] && key<arr[mid]){
                  return search(arr,start,mid-1,key);
              }
              else{
                  return search(arr,mid+1,end,key);
              }
            }
            else{        // right part sorted
                if(key>arr[mid] && key <= arr[end]){
                    return search(arr,mid+1,end,key);
                }
                else{
                   return search(arr,start,mid-1,key);
                }                     

            }
        }


}