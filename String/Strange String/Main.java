
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc= new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      int m=sc.nextInt();
     char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int n=arr.length;

      for(int i=0;i<m;i++){
        int ch = i%26;
        
        if(ch%2==0){
        sb.insert(0,arr[ch]);
        }
        else{
          sb.append(arr[ch]);
        }
      
      }
      sb.toString();
      System.out.print(sb);
    }
}