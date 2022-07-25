
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int diff[] = new int[n];
        int overallSum = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
            diff[i] = a[i] - b[i];
            overallSum += diff[i];
        }
        if(overallSum<0){
            System.out.println(-1);
        }
        else{
            int start = 0, sum = 0;
            for(int i=0;i<n;i++){
                sum += diff[i];
                if(sum<0){
                    sum = 0;
                    start = (i+1)%n;
                }
            }
            System.out.println(start);
        }
    }
}
