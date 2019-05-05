package Arraylist;

import java.util.ArrayList;

public class Addlist1tolist2 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("uk");
		list1.add("india");
		list1.add("usa");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("size of list1 is :"+list1.size());
		System.out.println("size of list2 is :"+list2.size());
		list2.addAll(list1);
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));

		}
		System.out.println("size of list2 is :"+list2.size());

	}
}
