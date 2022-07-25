import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        int count =0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(i+1);
                count=1;
                break;
            }
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}