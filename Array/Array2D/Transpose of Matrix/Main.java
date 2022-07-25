
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[][]=new int[a][a];
        for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                b[i][j]=sc.nextInt();     
        }
    }
       for(int i=0;i<a;i++){

            for(int j=0;j<a;j++){
                System.out.print(b[j][i]+" ");    
        }
        System.out.print("\n"); 
    }
}
}