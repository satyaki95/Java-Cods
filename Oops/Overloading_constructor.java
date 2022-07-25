package Java.Oops;


class copy3 {
	String name,gender;
	int phone;
	
	copy3(String name,String gender,int phone){
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	} 
	copy3(String name,int phone){
		this.name=name;
		this.phone=phone;
	}
	copy3(){
		System.out.print("No information");
	}
	
	void print(){
		 System.out.println("Name - "+name);
		 System.out.println("Gender - "+gender);
		 System.out.println("Phone - "+phone);
		 System.out.println("\n");
	}
}
public class Overloading_constructor {
    public static void main(String[] args) {
        copy3 class1=new copy3("Satyaki","Male",8274973);
		class1.print();
		
		 copy3 class2=new copy3("Soma",123456);
		 class2.print();
		 
		 copy3 class3=new copy3();
    }
}
