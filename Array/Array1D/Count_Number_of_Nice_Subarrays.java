package Array1D;
import java.io.*;
import java.util.*;
public class Count_Number_of_Nice_Subarrays {
    public static void main(String args[]) {
        // your code here
      Scanner sc = new Scanner(System.in);
      HashMap<Integer,Integer> map = new HashMap<>();
      int n = sc.nextInt();
      int k = sc.nextInt();
      int [] arr = new int[n];
      int [] binary = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        if(arr[i]%2!=0){
          binary[i] = 1;
        }
        else{
          binary[i] = 0;
        }
      }
      // number of subaarys with sum equal to k
      // make prefix array
      map.put(0,1);
      int prefix =0;
      int count = 0;
      for(int i=0;i<n;i++){
        prefix+= binary[i];
        if(map.containsKey(prefix-k)){
          count = count + map.get(prefix-k);
        }
          map.put(prefix,map.getOrDefault(prefix,0)+1);     
      }
      System.out.println(count);
    }
}
