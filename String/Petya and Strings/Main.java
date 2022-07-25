import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.next();
        s2=sc.next();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        int compare=s1.compareTo(s2);
        if(compare<0)
        {
            System.out.println(-1);
        }
        else if(compare>0)
        {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}