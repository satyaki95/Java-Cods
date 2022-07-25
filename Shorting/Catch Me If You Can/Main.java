
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
  int n,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr); 
        int police = 0,ans = 0;;

        for(int i=k-1;i>=0;i--){

            if(police>=arr[i]){
              break;
            }

            int jumpRequired = n-arr[i]; 

            police = police+jumpRequired;
            ans++;


        }
        System.out.println(ans);
    }
}