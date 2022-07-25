import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      int upper=0;
      int lower=0;
      
      for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
        }
       if(upper<=lower)
        System.out.print(upper);
        else
        System.out.print(lower);
      }
    
    }
