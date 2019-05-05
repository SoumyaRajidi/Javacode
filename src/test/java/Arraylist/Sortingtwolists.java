package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

//import java.util.Collection;

public class Sortingtwolists {  //sorting and comparing two list values

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("uk");
		list1.add("india");
		list1.add("srilanka");
		list2.add("uk");
		list2.add("srilanka");
		list2.add("india");
		if (list1.equals(list2)) {
			System.out.println("both are equal");
		}
			else {
				System.out.println("both lists are not equal");
		}
		System.out.println("before sorting list1 :"+list1);
		Collections.sort(list1);
		System.out.println("after sorting list1 :"+list1);
		System.out.println("before sorting list2 :"+list2);
		Collections.sort(list2);
		System.out.println("after sorting list1 :"+list2);
		if (list1.equals(list2)) {
			System.out.println("both are equal");
		}
			else {
				System.out.println("both lists are not equal");
		}
		

	}

}
