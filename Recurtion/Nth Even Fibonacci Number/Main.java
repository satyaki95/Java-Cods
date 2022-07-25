import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here.
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ans = evenFib(n);
      System.out.println(ans);
    }
   public static int evenFib(int n){
     if(n==0){
       return 0;
     }
     if(n==1){
       return 2;
     }
     return 4*evenFib(n-1) + evenFib(n-2);
   } 
}