package Java.Oops;


class student{
	String name;
	int id;
	static String un="lu";
	student(String n,int i){
		name=n;
		id=i;
	}
	void print() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(un);
	}
}
public class Static_keyword {
    public static void main(String[] args) {
        student f1=new student("satyaki",27);
		f1.print(); 
    }
}
