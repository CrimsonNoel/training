package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * Iterator 1회성
 * it.hashNext() : 다음에 입력된 주소 있으면 true
 * it.Next()	 : 다음 주소 return
 */
public class Iterator_Ex_01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");	list.add("2");	list.add("13");	list.add("42");
		list.add("5");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it = list.iterator();
				
				while(it.hasNext()) {
					//Object.obj = it.next();
					System.out.print(it.next());
				}
				System.out.println();
				it = list.iterator(); // 주소 재정의 하면 다시사용간가능
				while(it.hasNext()) {
					System.out.print(it.next());
				}
				}	
	}


