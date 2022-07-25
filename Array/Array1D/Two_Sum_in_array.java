package Array1D;

import java.util.*;
import java.io.*;

public class Two_Sum_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        int copy[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            copy[i]=arr[i];
        }
        Arrays.sort(arr);
        int start=0,end=n-1;
        int a=0,b=0;

        while(start<end){
            if((arr[start] + arr[end])==target){
                a = arr[start];
                b = arr[end];
                break;
            }
            else if((arr[start] + arr[end]) < target){
                start++;
            }
            else{
                end--;
            }
        }
        int ans[]=new int[2];

        for(int i=0;i<n;i++){
            if(a==copy[i])
            ans[0]=i;

            else if(b==copy[i])
            ans[1]=i;
        }

        if(ans[0]>ans[1])
        System.out.println(ans[1]+" "+ans[0]);

        else
        System.out.println(ans[0]+" "+ans[1]);
    }
}
