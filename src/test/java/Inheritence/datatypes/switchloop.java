package Inheritence.datatypes;

public class switchloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int languageOption=2;
  int accOption=3;
  switch(languageOption) {
  case 1:
	  System.out.println("language is English");
	  switch(accOption) {
	  case 1:
		  System.out.println("savings");
		  break;
	  case 2:
		  System.out.println("current");
		  break;
	  case 3:
		  System.out.println("loan");
		  break;
	  }
	   break;
  case 2:
	    System.out.println("language is French");
	    switch(accOption) {
      case 1:
	       System.out.println("savings");
	       break;
      case 2:
	        System.out.println("current");
	        break;
      case 3:
	        System.out.println("loan");
	        break;
	    }
	    break;
  case 3:
	  System.out.println("language is Hindi");
	  switch (accOption) {
      case 1:
	       System.out.println("savings");
	       break;
     case 2:
	        System.out.println("current");
	        break;
     case 3:
	        System.out.println("loan");
	        break;
	  }
	  break;
  }
	}

}
