package Arraylist;

import java.util.ArrayList;

public class Addall2 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("uk");
		list1.add("india");
		list1.add("usa");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("size of array before removing :" + list1.size());
		list1.remove(1);
		System.out.println("size of array after removing :" + list1.size());

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));

		}

	}
}
