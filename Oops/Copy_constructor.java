package Java.Oops;

public class Copy_constructor {
    int id;
	String name;
	Copy_constructor(int id,String name){
		this.id=id;
		this.name=name;
	}
	Copy_constructor(Copy_constructor ct){
		id=ct.id;
		name=ct.name;
	}
	void print() {
		System.out.println(id+" "+name);
	}
public static void main(String[] args) {
    Copy_constructor call=new Copy_constructor(1,"Satyaki");
    Copy_constructor call1=new Copy_constructor(call);
    //call1.id=12;
    //call1.name="java";  //[for changing copy constructor value]
    call.print();
    call1.print();
}
}
