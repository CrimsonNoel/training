package ch14_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Ex_03 {
	static HashMap<String, Map<String,String>> phoneBook = new HashMap();
	public static void main(String[] args) {
		  addPhoneNo("친구", "이자바", "010-111-1111");
	      addPhoneNo("친구", "김자바", "010-222-2222");
	      addPhoneNo("친구", "김자바", "010-333-3333");
	      addPhoneNo("회사", "김대리", "010-444-4444");
	      addPhoneNo("회사", "김대리", "010-555-5555");
	      addPhoneNo("회사", "박대리", "010-666-6666");
	      addPhoneNo("회사", "이과장", "010-777-7777");
	      addPhoneNo("세탁", "010-888-8888");
//	      System.out.println(phoneBook);
	      
	      printList();
	}
    private static void printList() {
		Set<String> phoneKey = phoneBook.keySet();
		for(String groupName : phoneKey) {
			System.out.println("*"+groupName+"*");
			Map<String,String> subMap = phoneBook.get(groupName);
			Set<String> subSet = subMap.keySet();
			
			for(String tel : subSet) {
				System.out.println(subMap.get(tel)+": "+tel);
			}
			System.out.println("=============================");
			Set<Map.Entry<String, String>> eset = subMap.entrySet();
			
			for(Map.Entry<String,String> ent : eset) {
				System.out.println("entry - "+ent.getValue()+": "+ent.getKey());
			}
		}
	}

	private static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	private static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String,String> group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);  // 이름은 중복될 수 있으니 전화번호를 key로 저장한다?
	}
	private static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) 
			phoneBook.put(groupName, new HashMap());
		
	}
	
	
}
