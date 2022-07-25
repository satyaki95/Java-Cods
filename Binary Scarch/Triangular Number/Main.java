import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      for(int i=0;i<n;i++){
        sum+=i;
        if(sum==n){
          System.out.println("1");
          break;
        }
      }
      if(sum!=n){
        System.out.print("0");
      }
    }
}