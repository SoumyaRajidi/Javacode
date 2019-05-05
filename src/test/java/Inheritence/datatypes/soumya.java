
package Inheritence.datatypes; // write and call a methd wihout return type and parameters

class method{
private double num1;
private double num2;
 method(double x,double y){
	 num1=x;
	 num2=y;
	 
 }
  void sum() {
	  double result=num1+num2;
	  System.out.println("result is"+result);
  }
 }

class soumya{
 public static void main(String[] args) {
    method s=new method(20,30.5);
    s.sum();

     }
}

