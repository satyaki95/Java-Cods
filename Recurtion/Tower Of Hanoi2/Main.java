
import java.util.*;
import java.io.*;

public class Main {
    public static int moves =0;
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      int n  = sc.nextInt();
      char A ;
      char B ;
      char C ;
      toh('A','C','B',n);
      System.out.println(moves);
    }
  public static void toh(char s,char d, char h,int n){
    if(n==0){
      return;
    }
    toh(s,h,d,n-1);
    moves = moves + 1;
    toh(h,d,s,n-1);
    return;
  }
}