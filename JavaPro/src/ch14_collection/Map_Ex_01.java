package ch14_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// key는 중복을 허용하지 않는다.
public class Map_Ex_01 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		// 중복되는 값은 나중에 오는 같은 값이 오버라이드되서 덮어씌어진다?
		// 김삿갓 = 4567 => 김삿갓 =3456 
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);		}
		
		
		System.out.println(map);
		
		
		// Value = map.get(key) => Key에 해당하는 Value 값을 리턴
		System.out.println("홍길동의 번호: "+map.get("홍길동"));
		System.out.println("이몽룡의 번호: "+map.get("이몽룡"));
		System.out.println("김삿갓의 번호: "+map.get("김삿갓"));
	
		// Key값들만 조회
		System.out.println("Key 값들만 조회하기");
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "의 번호: "+map.get(k)); 
		}
		
		// Value값들만 조회
		System.out.println("Value 값들만 조회하기");
		Collection<Integer> values = map.values(); // => key값 조회 불가		
		for(Integer v : values) {
			System.out.println(v); 
		}
		// key,value의 쌍인 객체로 조회
		System.out.println("Key,Value 쌍인 객체로 조회하기");
		Set<Map.Entry<String,Integer>> entry = map.entrySet(); // => key값 조회 불가		
		for(Map.Entry<String,Integer> m : entry) {
			System.out.println(m.getKey()+"의 번호: "+m.getValue());		
//		System.out.println(m);
	}
	}
}

