import java.util.*;
import java.io.*;

public class Main {
   public static int curr = 0;
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(n + " ");
      recursive1(n);
      recursive2(curr,n);
    }
  public static void recursive1(int n ){
    if(n>0){
      System.out.print((n-5) + " ");
      curr = n-5;
      recursive1(n-5);
    }
    else{
      return;
    }
  }
  public static void recursive2(int ans,int n){
    if(ans==n){
      return;
    }
    else{
      System.out.print( (ans+5) + " ");
      recursive2(ans+5,n);
    }
  }
}