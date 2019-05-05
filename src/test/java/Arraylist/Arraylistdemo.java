package Arraylist;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("uk");
		list.add("INDIA");
		list.add("USA");
		list.add("123");
		System.out.println("get first value is  " + list.get(0));
		System.out.println("get first value is  " + list.get(1));
		System.out.println("get first value is  " + list.get(3));
		for (String i : list) {
			System.out.println(i);
			if (i.contains("ugaanda")) {
				System.out.println("country is present");
				System.out.println("not present");

			}
		}
	}

}
