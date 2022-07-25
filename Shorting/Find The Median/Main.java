
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int [a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int q=arr.length;
        System.out.println(arr[q/2]);
    }
}
/*public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =1 ; i<n;i++){
	    int key = arr[i];
	    int j = i-1;
	    int temp =0;
	    while(j>=0 && key < arr[j]){
	       temp = arr[j+1];
	       arr[j+1] = arr[j];
	       arr[j] = temp;
	       j--;
	    }
	  }
      System.out.println(arr[(n-1)/2]);
    }
}*/