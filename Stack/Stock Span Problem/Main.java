import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int value;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            value=arr[i];
            while(!st.empty() && value>arr[st.peek()]){
                arr[st.peek()]=st.peek()-i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){
            arr[st.peek()]=st.peek()+1;
            st.pop();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}