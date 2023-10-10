package ch14_collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Iterator_Ex_02 {

	public static void main(String[] args) {
			//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String,Integer>();
			// 객체 저장
		map.put("나자바", 85);		map.put("홍길동",90 );		
		map.put("동장군", 80);		map.put("홍길동", 95);
		System.out.println("총 Entry 수: "+ map.get("홍길동"));
		System.out.println();
		// map.keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("	map.keySet()");
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+ key+" : "+value);
		}
		System.out.println();
		
		
		System.out.println("	map.entrySet()");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> en = entryIt.next();
			System.out.println("\t"+en.getKey()+" : "+ en.getValue());
			}
		System.out.println();
		
		System.out.println("	map.values()");
		Collection<Integer> c = map.values();
		Iterator<Integer> valuesIterator = c.iterator();
		while(valuesIterator.hasNext()) {
			Integer value = valuesIterator.next();
			System.out.println("\t"+value);
		}
		System.out.println();
		
		
		// 객체 전체 삭제
				map.clear();
				System.out.println("총 Entry 수: "+map.size());
	}

}
