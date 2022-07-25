import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = "";
        while((s1.length()!=0) && (s2.length()!=0)){
            result = result + s1.charAt(0) + s2.charAt(0);
            s1 = s1.substring(1);
            s2 = s2.substring(1);
        }
        if(s1.length()==0 && s2.length()!=0){
            result = result + s2;
        }
        if(s2.length()==0 && s1.length()!=0){
            result = result + s1;
        }
        System.out.println(result);
    }
}