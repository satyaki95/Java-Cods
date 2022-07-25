package Java.Oops;


class copy1 {
	String name,gender;
	int phone;
	
	copy1(String name,String gender,int phone){
		this.name=name;
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
public class Constructor {
    public static void main(String[] args) {
        copy1 class1=new copy1("Satyaki","Male",8274973);
		class1.print();
		
		 copy1 class2=new copy1("Soma","Female",123456);
		 class2.print(); 
    }
}
