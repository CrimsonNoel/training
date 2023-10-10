package ch14_collection;

import java.util.LinkedList;


public class LinkedList_Ex_01 {

	public static void main(String[] args) {
			LinkedList<String> l1 = new LinkedList<>();
			l1.add("1");
			l1.add("3");
			l1.add("9");
			l1.add("5");
			System.out.println(l1);
			l1.addFirst("3");
			
			System.out.println(l1);
	}
}
