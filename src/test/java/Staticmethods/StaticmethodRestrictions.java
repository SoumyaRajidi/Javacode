package Staticmethods;

public class StaticmethodRestrictions {
	static String uname="soumya";
	String pw="1234";
	public static void main(String[] args) {
		String pw="1234";
	    method1();
	//nonStaticMethod();
	}
	static void method1() {
		uname="sundeep";
		//pw="abcd";
		System.out.println("thois is static");
		//System.out.println(pw);
	}
		
	
    void nonStaticMethod() {
    	uname="shrihas";
    	pw="AAAA";
    	System.out.println(uname);
		System.out.println(pw);
    }
	}

