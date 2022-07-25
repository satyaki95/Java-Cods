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
      for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
          arr[i]=arr[i+1];
        }
        else{
          arr[i]=-1;
        }
      }
      arr[n-1]=-1;
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
    }
}