
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=1;i<n;i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && key<arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                count ++;
                j--;
            }
        }
        System.out.println(count);
    }
}