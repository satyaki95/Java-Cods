package Java.Oops;


class Creat_class3 {
	String name,gender;
	int phone;
	//paramitarised method
	void set(String name,String gender,int phone) {
		this.name=name;
		this.gender=gender;
		this.phone=phone;
	}
    	//non paramitarised method
	void print(){
        System.out.println("Name - "+name);
        System.out.println("Gender - "+gender);
        System.out.println("Phone - "+phone);
        System.out.println("\n");
   }
}
public class Call3 {
    public static void main(String[] args) {
        Creat_class3 class1=new Creat_class3();
		 class1.set("Satyaki","Male",82749736);

		 Creat_class3 class2=new Creat_class3();
		 class2.set("Soma","Female",123456);
		 
		 class1.print(); 
		 class2.print();
    }
}
