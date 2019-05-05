package Arraylist;

import java.util.ArrayList;

public class Addall {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		list1.add("uk");
		list1.add("india");
		list1.add("usa");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	System.out.println("??????? :"+list1.get(1));
		list1.add(1,"wales");
		System.out.println("??????? :"+list1.get(1));
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));

	}
		System.out.println("??????? :"+list1.get(1));

}
}
