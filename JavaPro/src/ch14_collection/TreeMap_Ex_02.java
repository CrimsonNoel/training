package ch14_collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Ex_02 {

	public static void main(String[] args) {
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		scores.put(87, "홍길동");	scores.put(98, "이동수");
		scores.put(75, "박길순");	scores.put(95, "신용권");
		scores.put(80, "김자바");
										// 역순으로 정렬하기
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry :descendingEntrySet ) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");	}
		System.out.println();
										// 역순으로 정렬한거 다시 역순으로
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry :ascendingEntrySet ) {
			System.out.print(entry.getKey()+"-"+entry.getValue()+" ");	}
	
	}

}
