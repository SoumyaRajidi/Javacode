package Methods;
class creatobj{
	String browser="firefox";
	String url="www.yahoo.com";
	String user="username";
	String pw="passwords";
	void login() {
		System.out.println(user);
		System.out.println(pw);
	}
	void getBrowserandUrl() {
		System.out.println(browser);
		System.out.println(url);
	}
	void initializeMethod(String browser1, String url1, String user1, String pw1 ) {
		browser=browser1;
		url=url1;
		user=user1;
		pw=pw1;
		
	}
}

/*public class testBase {  

	public static void main(String[] args) {
		creatobj var=new creatobj(); // initializing with reference variables
		var.login();
		var.getBrowserandUrl();
		System.out.println("//////before////");
		
		var.browser="opera";
		var.url="gmail.com";
		var.user="soumya";
		System.out.println("/////after/////");
		var.login();
		var.getBrowserandUrl();
		System.out.println("//////");
		var.login();
		
		
		
	}

}*/
