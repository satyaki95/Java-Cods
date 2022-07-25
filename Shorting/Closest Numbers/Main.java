import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
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
    int a = Integer.MAX_VALUE;
    for(int i=0;i<n-1;i++){
        int diff = arr[i+1]-arr[i];
        a= Math.min(a,diff);
    }
    for(int i=0;i<n-1;i++){
        if(arr[i+1]-arr[i]==a){
            System.out.print(arr[i] + " " + arr[i+1] + " ");
        }
    }


}
}