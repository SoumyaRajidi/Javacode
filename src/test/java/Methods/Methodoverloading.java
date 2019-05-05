package Methods;

public class Methodoverloading {
	int roolno=0;
	String username;
	String pw;
	void method1() {
		System.out.println("this is default method");
	
	}
	void method1(String userval, String pwval) {
		username=userval;
		pw=pwval;
		System.out.println("two string arguments "+username);
		System.out.println("two string arguments "+pw);
	}
	void method1(String usercredential, int number){
		username=usercredential;
		roolno=number;
		System.out.println(username);
		System.out.println(roolno);
		
		
	}
}
