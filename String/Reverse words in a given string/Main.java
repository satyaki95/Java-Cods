import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      String s[] = sc.nextLine().split("\\.");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--)
        {
            ans += s[i] + ".";
        }
        System.out.println(ans.substring(0,ans.length() - 1));
	}
}