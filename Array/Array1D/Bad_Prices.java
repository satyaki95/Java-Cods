package Array1D;
import java.util.*;
import java.io.*;
public class Bad_Prices {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->=1){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
           int min=arr[n-1];
           for(int i=n-2;i>=0;i--){
               if(arr[i]>min){
                   count++;
               }
               min=Math.min(arr[i],min);
           }
            System.out.println(count);
        }
        
    }
}
