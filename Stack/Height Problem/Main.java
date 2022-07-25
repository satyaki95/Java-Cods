import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int [] arr = new int[n];
        int val;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            val = arr[i];
            while(!st.empty() && val<arr[st.peek()]){
                arr[st.pop()] = val;
            }
            st.push(i);
        }
        while(!st.empty()){
            arr[st.pop()]=-1;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}