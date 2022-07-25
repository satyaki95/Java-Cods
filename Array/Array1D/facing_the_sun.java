package Array1D;
import java.util.*;
import java.io.*;
public class facing_the_sun {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=1;
    
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int f=arr[0];
    for(int i=1;i<n;i++){
         if(f<arr[i]){
            count++;
            f=arr[i];
        }
    }
    System.out.println(count);
   }
}
