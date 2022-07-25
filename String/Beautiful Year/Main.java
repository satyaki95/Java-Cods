
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        t++;
        while(true){
            int n=t;
            int a = n%10; n=n/10;
            int b = n%10; n=n/10;
            int c = n%10; n=n/10;
            int d = n%10; n=n/10;
            if(a==b || a==c || a==d || b==c || b==d || c==d){
                t++;
            }
            else{
                break;
            }
        }
        System.out.println(t);
      } 
    }