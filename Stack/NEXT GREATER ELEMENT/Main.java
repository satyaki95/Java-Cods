import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val;
        Stack<Integer> st = new Stack<>();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        st.push(0);
        for(int i=1;i<n;i++){
            val = arr[i];
            while(!st.empty() && val>arr[st.peek()]){
                arr[st.pop()] = val;
                
            }
            st.push(i);
        }
        while(!st.empty()){
            arr[st.pop()] = -1;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}