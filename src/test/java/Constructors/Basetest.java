package Constructors;

public class Basetest {

	public static void main(String[] args) {
		Defaultconstructor obj=new Defaultconstructor();
		obj.method1();
		Defaultconstructor obj1=new Defaultconstructor("shrihas","aaaa");
		obj1.method1();
		Defaultconstructor obj2=new Defaultconstructor("shlesha", "xyz", 12);
		obj2.method1();
	}
 
}
