import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
    	
		
		Scanner sc=new Scanner(System.in);
		
		String st=sc.next();
		Stack<Character> stack=new Stack<>();
		int i;
		for(i=0;i<st.length();i++) {
			stack.push(st.charAt(i));
		}
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
	}

}
