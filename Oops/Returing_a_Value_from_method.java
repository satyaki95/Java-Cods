package Java.Oops;


import java.util.*;
class copy4 {
	int square(int value) {
		return value*value;
	}
}
public class Returing_a_Value_from_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		copy4 call=new copy4();
		int result=call.square(n);
		System.out.println(result);
    }
}
