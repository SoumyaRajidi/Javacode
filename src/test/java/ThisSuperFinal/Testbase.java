package ThisSuperFinal;

public class Testbase {
	//class creatobj {
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
		void initializeMethod(String browser, String url, String user, String pw) {
			this.browser=browser;
			this.url=url;
			this.user=user;
			this.pw=pw;
			
		}
		void getResult() {
			System.out.println(user);
			System.out.println(pw);
			System.out.println(browser);
			System.out.println(url);
			
		}
	}



