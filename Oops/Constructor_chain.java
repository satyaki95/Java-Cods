package Java.Oops;


class copy9 {
	String name,gender;
	int phone;
	// Parametrized constructor
	copy9(String name,String gender,int phone){
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	} 
	// non Parametrized constructor
	copy9(){
		System.out.println("No value");
	}
	copy9(String gender,int phone){
		this.gender=gender;
		this.phone=phone;
	} 
	void print(){
		 System.out.println("Name - "+name);
		 System.out.println("Gender - "+gender);
		 System.out.println("Phone - "+phone);
		 System.out.println("\n");
	}
}
public class Constructor_chain {
    public static void main(String[] args) {
        copy9 call=new copy9("satyaki","male",82749736);
		call.print();
		copy9 call1=new copy9("male",90512725);
		call1.print();
		copy9 call2=new copy9();
    }
}
