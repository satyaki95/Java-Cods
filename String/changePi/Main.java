
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       String s=sc.next();
       String r=changePi(s);
       System.out.print(r);
       
    }
    public static String changePi(String str) {
       
  if(str.length()==0 || str.length()<2)
  return str;
  if(str.charAt(0)=='p' && str.charAt(1)=='i')
  return "3.14"+changePi(str.substring(2));
  else
  return str.charAt(0)+changePi(str.substring(1));
}

}