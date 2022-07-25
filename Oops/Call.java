package Java.Oops;

class Creat_class {
	String name,gender;
	int phone;
}
public class Call {
    public static void main(String[] args) {
        Creat_class class1=new Creat_class();
		 
		 class1.name="Satyaki Saha";
		 class1.gender="Male";
		 class1.phone=827497368;
		 System.out.println("Name - "+class1.name);
		 System.out.println("Gender - "+class1.gender);
		 System.out.println("Phone - "+class1.phone);
		 
		 Creat_class class2=new Creat_class();
		 
		 class2.name="soma";
		 class2.gender="Female";
		 class2.phone=827497368;
		 System.out.println("Name - "+class2.name);
		 System.out.println("Gender - "+class2.gender);
		 System.out.println("Phone - "+class2.phone);
    }
}

