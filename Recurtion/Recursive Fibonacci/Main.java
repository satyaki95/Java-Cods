import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(fib(n));
    }
  public static int fib(int n){
    if(n==2 || n==1)
      return n-1;
    else
    return fib(n-1)+fib(n-2);
  }
}