
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
      Scanner sc = new Scanner(System.in);
      Queue<Integer> qu = new LinkedList<>();
      Queue<Integer> res = new LinkedList<>();
      Stack<Integer> st = new Stack<>();
      int n = sc.nextInt();
      int k = sc.nextInt();
      for(int i=0;i<n;i++){
        qu.add(sc.nextInt());
      }
      for(int i=0;i<k;i++){
        st.push(qu.remove());
      }
      while(!st.empty()){
        res.add(st.peek());
        st.pop();
      }
      for(int i=k;i<n;i++){
        res.add(qu.remove());
      }
      for(int i=0;i<n;i++){
        System.out.print(res.remove() + " ");
      }
    }
}