package Array1D;
import java.util.*;
import java.io.*;
public class Minimum_coins {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr={1,2,5,10,20,50,100,200,500,2000};
        int i=9,sum=0;
        while(n>0 && i>=0)
        {
            sum+=n/arr[i];
            n=n%arr[i];
            i--;
        }
        System.out.println(sum);
    }
}
