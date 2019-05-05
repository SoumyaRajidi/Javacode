package Arraylist;

import java.util.ArrayList;

public class Arraylistobjectintialization {

	public static void main(String[] args) {

		Demolist d1 = new Demolist(10, "loginpage", "ie", "url1", true);
		Demolist d2 = new Demolist(20, "registerpage", "firefox", "url2", true);
		Demolist d3 = new Demolist(30, "logout", "opera", "url3", false);
		ArrayList<Demolist> list = new ArrayList<Demolist>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).testcasecount);
			System.out.println(list.get(i).testcasename);
			System.out.println(list.get(i).browsername);
			System.out.println(list.get(i).url);
			System.out.println(list.get(i).testcasestatus);
			

		}

	}

}
