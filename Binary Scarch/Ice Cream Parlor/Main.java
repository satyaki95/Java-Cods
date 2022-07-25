import java.util.*;

public class Main{
  public static void func(int[] arr, int k){
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int i=0;i<arr.length;i++){
      if(map.containsKey(k-arr[i])){
        System.out.println(map.get(k-arr[i])+" "+(i+1));
        return;
      }
      else
        map.put(arr[i],i+1);
    }
  }
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
    for(int j=0;j<t;j++){
      int k=sc.nextInt();
      int n= sc.nextInt();

      int[] arr= new int[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      func(arr, k);
     }
    }
}
// import java.io.*;
// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         // your code here
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         for(int a=0;a<t;a++){
//             int m = sc.nextInt();
//             int n = sc.nextInt();
//             int [] cost = new int[n];
//             int count =0;
//             for(int i=0;i<n;i++){
//                 cost[i] = sc.nextInt();
//             }
//             for(int i=0;i<n-1;i++){
//               for(int j =i+1;j<n;j++){
//                  if((cost[i] + cost[j])==m){
//                      System.out.println((i+1) + " " + (j+1));
//                      count++;
//                      break;
//                  }
//               }
//               if(count==1){
//                   break;
//               }
//             }
//         }
//     }
// }