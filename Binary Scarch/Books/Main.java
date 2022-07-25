import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int freetime = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int time =0;
        int maximum =0;
        int books =0;
        int t = freetime;
        for(int i=0;i<n;i++){
            int j=i;
            while(j<n){
                if(arr[j]<=t){
                    books++;
                    time += arr[j];
                    t= freetime-time;
                }
                else{
                    break;
                }
                j++;
            }
            maximum = Math.max(maximum,books);
            time =0;
            t = freetime;
            books =0;
        }
        System.out.println(maximum);
    }
}