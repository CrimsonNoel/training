package ch14_collection;

import java.util.Hashtable;

// Hashtable :  동기화 (synchronizes) 되어있음. null 허용하지 않는다.
public class Hashtable_Ex_01 {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "java");
		ht.put(102, "html");
		ht.put(101, "css");
		ht.put(103, "javascript");
		//ht.put(104, null); 
		System.out.println(ht);
	
	

	
	}
}
