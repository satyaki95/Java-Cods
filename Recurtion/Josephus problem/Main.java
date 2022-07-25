import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int position = jos(n,k);
        System.out.println(position+1);
    }
    public static int jos(int n, int k){
        if(n==1){
            return 0;
        }
        return  (jos(n-1,k) + k) % n; 
    }
}