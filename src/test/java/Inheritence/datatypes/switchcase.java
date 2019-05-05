package Inheritence.datatypes;

public class switchcase {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// String environment="soumya";
		//String url;
		//switch(environment) {
		//case "Dev":
		//url="www.devenvironment";
		//System.out.println(url+"  "+environment);
		//break;
		//case "UAT":
		//url="www.UATenvironment";
		//System.out.println(url+"  "+environment);
		//break;
		//case "test":
		//url="www.testenvironment";
		//System.out.println(url+"  "+environment);
		//break;
		//default:
		//System.out.println("no environment selected");


		// }


// Another program on switch case

		String language = "french";
		int accounttype = 1;
		int cardtype = 2;
		switch (language) {
			case "english":
				switch (accounttype) {
					case 1:
						System.out.println("this is current account");
						switch (cardtype) {
							case 1:
								System.out.println("provide credit card to the customer");
								break;
							case 2:
								System.out.println("provide Debit card to the customer");
								break;
						}
					case 2:
						System.out.println("this is savings accout");
						switch (cardtype) {
							case 1:
								System.out.println("provide credit card to the customer");
								break;
							case 2:
								System.out.println("provide Debit c ard to the customer");
								break;
						}
				}


			case "french":
				switch (accounttype) {
					case 1:
						System.out.println("FRENCH this is current account");
						switch (cardtype) {
							case 1:
								System.out.println("FERNCH provide credit card to the customer");
								break;
							case 2:
								System.out.println("FRENCH provide Debit card to the customer");
								break;
						}
						break;
					case 2:
						System.out.println("FRENCH this is savings accout");
						switch (cardtype) {
							case 1:
								System.out.println("FRENCH  provide credit card to the customer");
								break;
							case 2:
								System.out.println(" FRENCH  provide Debit c ard to the customer");
								break;
						}
				}
		}
	}
}


