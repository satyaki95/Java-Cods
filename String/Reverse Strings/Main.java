import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      for(int i=s.length()-1;i>=0;i--){
        System.out.print(s.charAt(i));
      }
    }
}