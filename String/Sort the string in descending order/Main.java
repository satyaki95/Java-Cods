import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      char ch[]=s.toCharArray();
      Arrays.sort(ch);
      for(int i=ch.length-1;i>=0;i--){
        System.out.print(ch[i]);
      }
	}
}