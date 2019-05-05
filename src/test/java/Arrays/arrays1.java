package Arrays;

public class arrays1 {

	public static void main(String[] args) {
		//String arr[]=new String[10];   // program for spliting the string
		String str="this, is, java, training";
		
		 String splitarr[]= str.split(",");
		 System.out.println("numberof words in array"+splitarr.length);
		 for(int i=0;i<splitarr.length;i++) {
			 System.out.println(splitarr[i]);
			
		 }
		 System.out.println(splitarr[3]);
		 for(String i: splitarr) {
			 System.out.println("Thos is anothr way od spliting  "+i);
		 }
		          

	}

}
