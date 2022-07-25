package Array1D;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum_of_Array_Except_Self {
    public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int arr1[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        sum+=arr[i];
      }
      for(int i=0;i<n;i++){
        arr1[i]=sum-arr[i];
        System.out.print(arr1[i]+" ");
      }
	}
}
