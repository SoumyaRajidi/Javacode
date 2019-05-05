package Methods;

public class Assignment {

	public static void main(String[] args) {
	String UniId= getMethod1("soumya,","rs108"); // how can i pass two data types here if i want to check the condition
	//getMethod1("ramya", "2222");	
	boolean IsIdRegistered=searchUser(UniId);
		if(IsIdRegistered==true) {
			System.out.println("user is successfully rigistered and login");
		}
		else {
			System.out.println("user is not rigistered");
		}
		//String UniId1= method1();
	}



	static String getMethod1(String s1, String s2){
		String s=s1+s2;
		System.out.println(s);
		System.out.println("navigate to Registration form\r\n" + 
				"enter all details and save\r\n" + 
				"unique id is displayed\r\n" );

		return "ID_1234";
	}

	static boolean searchUser(String UniId) {
		System.out.println(UniId);
		return true;
	}
	//static String getMethod1(String n1, String n2)
	//{
		//System.out.println("enter user id:" +s1);
		//System.out.println("enter password id:"+s2);
	//}


}

