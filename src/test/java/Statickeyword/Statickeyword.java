package Statickeyword;

public class Statickeyword {
	public static void main(String args[]){
	library obj=new library();
	obj.getBrowserandUrl();
	obj.browser="firefox";
	obj.url="google";
	obj.getBrowserandUrl();
	library.browser="Opera";
	//obj.getBrowserandUrl();
	System.out.println("//////");
	obj.getBrowserandUrl();
	obj.browser="FFFFF";
	library.getStaticMethod();
	obj.getBrowserandUrl();
	System.out.println("after creating another object");
	library obj1=new library();
	obj1.getBrowserandUrl();

	
			
}
}
	
