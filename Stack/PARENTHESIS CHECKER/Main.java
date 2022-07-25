import java.io.*;
import java.util.*;
/*public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int f=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='['){
                st.push(s.charAt(i));
                continue;
            }
            else{ 
                if(st.empty()==true){
                    f=1;
                    break;
                }
            
                if(s.charAt(i)==')'){
                    if(st.empty()){
                        break;
                    }
                    if(!st.empty() && st.peek()=='('){
                        st.pop();
                        
                    }
                    else break;
                }
                 if(s.charAt(i)==']'){
                     if(st.empty()){
                        break;
                    }
                    if(!st.empty() && st.peek()=='['){
                        st.pop();
                        
                    }
                    else break;
                }
                 if(s.charAt(i)=='}'){
                     if(st.empty()){
                        break;
                    }
                    if(!st.empty() && st.peek()=='{'){
                        st.pop();
                        
                    }
                    else break;
                }
            
            }



            }
            if(!st.empty() || f==1){
                System.out.print(0);
            }
            else{
                 System.out.print(1);
            }
        }
}*/
public class Main {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       Stack<Character> st=new Stack<>();

       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
               st.push(str.charAt(i));
           }else if(!st.empty() &&(
                    (str.charAt(i)==')' && st.peek()=='(') ||
                    (str.charAt(i)=='}' && st.peek()=='{') ||
                    (str.charAt(i)==']' && st.peek()=='['))){
                        st.pop();
                    }
            else{
                st.push(str.charAt(i));
            }
       }
       if(st.empty()){
           System.out.print("1");
       }else{
           System.out.print("0");
       }
    }
}