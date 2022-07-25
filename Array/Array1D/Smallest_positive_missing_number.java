package Array1D;

import java.util.*;
import java.io.*;
public class Smallest_positive_missing_number {
    public static int case1(int [] arr,int N){
        int counter=0;
        for(int i=0;i<N-1;i++){
          if(arr[i]+0==arr[i+1] || arr[i]+1==arr[i+1])
            counter=counter+1;
        }
        if(counter==N-1)
          return 0;
        else return 1;
      }
      public static int case2(int [] arr,int N){
        int counter=0;
        for(int i=0;i<N;i++){
          if(arr[i]<=0)
            counter=counter+1;
        }
        //System.out.println(counter);
        if(counter==N)
          return 0;
        else return 1;
      }
      public static void main(String args[]) {
          //your code here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr =new int[N];
        for(int i=0;i<N;i++){
          arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
          for(int j=i+1;j<N;j++){
            int tmp = 0;  
            if (arr[i] > arr[j]){
            tmp = arr[i];  
            arr[i] = arr[j];  
            arr[j] = tmp;
          }
        }
      }
      int chk=case1(arr,N);
      int chk1=case2(arr,N);
      if(chk==0){
        System.out.println(arr[N-1]+1);
      }
      else if(chk1==0){
          System.out.println(1);
      }
      else{
          int temp=0;
          for(int i=0;i<N-1;i++){
              if(arr[i+1]>0){
                  if(arr[i]+1!=arr[i+1] && arr[i]+0!=arr[i+1]){
                      if(arr[i]+1!=0){
                          System.out.println(arr[i]+1);
                          temp=1;
                      }
                  }
              }
              if(temp==1)
              break;
          }
      }
    }
}
