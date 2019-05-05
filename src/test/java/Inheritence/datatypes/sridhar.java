package Inheritence.datatypes;
class method3{   // write a program to method with return type and parameters
	//double num1;
	//double num2;
	static double sum(double num1,double num2) {
		double result =num1+num2;
		return result;
	}
}

public class sridhar {

	public static void main(String[] args) {
   // method3 m=new method3();
        double r= method3.sum(2,12);
     System.out.println("the value is"+r);   		

	}

}
