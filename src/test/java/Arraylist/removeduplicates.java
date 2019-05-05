package Arraylist;

import java.util.ArrayList;

public class removeduplicates {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("uk");
		list1.add("india");
		list1.add("usa");
		list2.add("uk");
		list2.add("india");
		System.out.println("size of list1 is :"+list1.size());
		System.out.println("size of list2 is :"+list2.size());
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("list1 :" +list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println("list2 :"+ list2.get(i));
		}
		list1.removeAll(list2);
		System.out.println("after removing duplicates fropm list 1");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("list1 :" +list1.get(i));
		}
		
		

	}

}
