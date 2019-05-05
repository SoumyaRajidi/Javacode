package Constructors;

public class Defaultconstructor {
     int n;
	String uname;
	String pw;
	
	Defaultconstructor(){
	    uname="soumya";
	    pw="1234";
	}
	Defaultconstructor(String s, String r){
		uname=s;
		pw=r;
	}
	Defaultconstructor(String s, String s1, int r){
		uname=s;
		pw=s1;
	     this.n=r;
		System.out.println(n);
		
	}
	
	void method1() {
		System.out.println("user name is:"+uname);
		System.out.println("password is:"+pw);
		System.out.println(n);

	}

}
