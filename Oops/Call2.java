package Java.Oops;


class Creat_class1 {
	String name,gender;
	int phone;
	
	void print(){
		 System.out.println("Name - "+name);
		 System.out.println("Gender - "+gender);
		 System.out.println("Phone - "+phone);
		 System.out.println("\n\n");
	}
}
public class Call2 {
    public static void main(String[] args) {
        Creat_class1 class1=new Creat_class1();
		 class1.name="Satyaki Saha";
		 class1.gender="Male";
		 class1.phone=827497368;
		 
		 
		 Creat_class1 class2=new Creat_class1();
		 class2.name="soma";
		 class2.gender="Female";
		 class2.phone=827497368;
		 
		 class1.print(); 
		 class2.print();
    }
}
