package Array1D;


import java.util.*;
import java.io.*;

public class Pairs_sum_divisible_by_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(find(arr,n,k));
    }

    public static int find(int []arr, int n, int k){

        int sum=0;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                sum=arr[i]+arr[j];

                if(sum%k==0)
                count++;

            }
        }

        return count;

    }
}
