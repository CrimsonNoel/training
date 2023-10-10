package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class List_Ex_01 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(0);
		list1.add(0);
		System.out.println(list1);
		for(int i=0; i<list1.size(); i++) {
			System.out.println(i+" : "+list1.get(i));
		}
		
		List<Integer> list3 = new ArrayList<Integer>(list1.subList(0,5));
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		if(list3.contains(2)) {  
			list3.remove(2);
		}
		System.out.println(list3);
		
		
	}

}
