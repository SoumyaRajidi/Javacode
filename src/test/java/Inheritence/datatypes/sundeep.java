package Inheritence.datatypes;

class method1 {   // write a program to method with return type and without parametrs
private double num1;
private double num2;
 method1(double x,double y){
	 num1=x;
	 num2=y;
	 
 }
  double sum() {
	  double result=num1+num2;
	  return result;
  }
 }

public class sundeep {

	public static void main(String[] args) {
		method1 m=new method1(30,25.6);
         double x=m.sum();
         System.out.println("sum of 2 numbers is" +x);
	}

}
