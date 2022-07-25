package Array1D;

import java.util.*;
import java.io.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean ans=false;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                ans=true;
            }
        }
        System.out.println(ans);



        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          }
          String flag="false";
          for(int i=0;i<n;i++){
            if(map.contains(arr[i])){
              flag="true";
              break;
            }
            else{
              map.add(arr[i]);
            }
          }
        System.out.print(flag);*/
    }
}
