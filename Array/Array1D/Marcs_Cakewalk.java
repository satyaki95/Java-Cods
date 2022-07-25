package Array1D;

import java.io.*;
import java.util.*;
public class Marcs_Cakewalk {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];

       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       long miles=0;
       int j=0;


       for(int i=n-1;i>=0;i--){
        miles= (long) (miles + Math.pow(2, j) * arr[i]);
        j++;
       }
       System.out.println(miles);
   } 
}
