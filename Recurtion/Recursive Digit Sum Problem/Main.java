
import java.util.*;
import java.io.*;

public class Main {
    static int func(int sum)
    {
        if(sum<10) // base case when number has only one digit
        {
            return sum;
        }

        // Recursive Case
        int new_sum = 0;
        while(sum>0)
        {
            int digit = sum%10; // last digit
            new_sum+=digit; // new sum addition
            sum/=10; // remove last digit
        }

        return func(new_sum);
    }

    public static void main(String args[]) {
        //your code her
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        int sum = 0;
        for(int i=0;i<s.length();i++)
        {
            int ascii_value = (s.charAt(i)); // get ith character
            ascii_value-=48; // ascii value of '0' = 48
            sum+=ascii_value; 
        }
        sum*=k; 

        int ans = func(sum);
        System.out.println(ans);
    }
}