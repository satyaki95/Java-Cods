
import java.util.*;
import java.io.*;

public class Main {
   public static long []  RightNextSmaller(long arr[]){
        Stack<Integer> stack = new Stack<Integer>();
        long [] rightIndex = new long[arr.length];
        stack.push(0);
        for(int i=1;i<arr.length;i++){
            long val = arr[i];
            while(!stack.empty() && val < arr[stack.peek()] ){
                rightIndex[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.empty()){
            rightIndex[stack.peek()] = arr.length - stack.peek();
            stack.pop();
        }
        return rightIndex;
    }
    public static long []  LeftNextSmaller(long arr[]){
        Stack<Integer> stack = new Stack<Integer>();
        long [] LeftIndex = new long[arr.length];
        stack.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            long val = arr[i];
            while(!stack.empty() && val <=arr[stack.peek()] ){
                LeftIndex[stack.peek()] = stack.peek()-i;
                stack.pop();
            }
            stack.push(i);
        }
        while(!stack.empty()){
            LeftIndex[stack.peek()] = stack.peek() +1;
            stack.pop();
        }
       return LeftIndex;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        long [] LeftRange = LeftNextSmaller(arr);
        long [] RightRange = RightNextSmaller(arr);
        long minimumSum = 0;
        for(int i =0;i<n;i++){
            minimumSum =  minimumSum + (arr[i] * (LeftRange[i] * RightRange[i]));
        }
        System.out.println(minimumSum);
    }
} 