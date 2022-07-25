package Java.Oops;


class copy2 {
	String name,gender;
	int phone;
	// Parametrized constructor
	copy2(String name,String gender,int phone){
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	} 
	// non Parametrized constructor
	copy2(){
		System.out.println("No value");
	}
	
	void print(){
		 System.out.println("Name - "+name);
		 System.out.println("Gender - "+gender);
		 System.out.println("Phone - "+phone);
		 System.out.println("\n");
	}
}
public class Constructor_type {
    public static void main(String[] args) {
        copy2 class1=new copy2("Satyaki","Male",8274973);
		class1.print();
		
		 copy2 class2=new copy2("Soma","Female",123456);
		 class2.print();
		 
		 copy2 class3=new copy2();
		 class3.print(); 
    }
}
