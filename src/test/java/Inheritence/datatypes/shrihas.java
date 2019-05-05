package Inheritence.datatypes; //see the error while using instance variables to static method
class method4{
	static int x;
	method4(int num){
		this. x=num;
	}
	static void sum() {
		System.out.println("x value is"+x);
	}
}

public class shrihas {

	public static void main(String[] args) {
		method4 obj=new method4(5);
		method4.sum();

	}

}
