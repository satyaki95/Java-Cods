package Array1D;
import java.util.*;
import java.io.*;
public class Maximum_Contiguous_Subarray_Sum {
    public static void main(String args[]) {
        //your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int maxSum = Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(maximumSubarraySum(arr));
    }
  public static int maximumSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= n - 1; j++) {
            currSum += arr[j];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            }
        }

        return maxSum;
    }
}
