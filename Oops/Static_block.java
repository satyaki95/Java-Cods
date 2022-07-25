package Java.Oops;


class some{
	static int id;
	static String name;
	
	static {
		id=101;
		name="Satyaki";
	}
	static void print() {
		System.out.println(id);
		System.out.println(name);
	}
}
public class Static_block {
    public static void main(String[] args) {
        some.print();
    }
}
