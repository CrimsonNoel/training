package ch14_collection;

import java.util.Vector;

public class Vector_Ex_01 {
public static void main(String[] args) {
		Vector<String> v = new Vector<String>(5); // 용량(capacity)이 5인 Vector를 만든다.
		v.add("1"); v.add("2"); v.add("3");
		print(v);
		
		v.trimToSize();  // 빈공간 제거.(용량과 크기가 같아 진다.)
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear(); // 내용만 삭제, 용량은 그대로
		System.out.println("=== After clear() ===");
		print(v);
		
		v.trimToSize(); 
		System.out.println("=== After trimToSize() ===");
		print(v);
		}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("Size: "+v.size());
		System.out.println("capacity: "+ v.capacity());
	}

}
