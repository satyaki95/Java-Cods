import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int count=1;
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
          count++;
      }
      System.out.println(count);
    }
}