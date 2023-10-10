package ch12_API;
//String 클래스의 주요 메서드
public class String_Ex_01 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4));// E. 5번쨰 문자 리턴
		// 정렬관련 메서드. "ABCDEFGH" - "abc" : 65 - 97 = -32
		System.out.println(s.compareTo("abc")); // -32
		// IgnoreCase : 대소문자 구분없이.
		System.out.println(s.compareToIgnoreCase("abcdefgh"));// 0
		
		// concat() : 문자열 연결. s = s+"abc";
		System.out.println("s.concat(\"abc\")= "+s.concat("abc")); // ABCDEFGHabc
		System.out.println("s+\"abc\"= "+s+"abc"+"\t");	// ABCDEFGHabc
		
		// endsWith : s문자열의 끝이 "GH"임??(true or false)
		System.out.println(s.endsWith("GH")); // true;
				
		// startsWith : s문자열의 시작이 "AB"? (true or false)
		System.out.println(s.startsWith("AB")); // true;
		
		System.out.println("\t");
		System.out.println(s.equalsIgnoreCase("abcdefgh")); // true;
		System.out.println(s.equals("abcdefgh")); // false;
	
		System.out.println("\t");
		s = new String("This is a String");
		
		// indexOf : 문자나 문자열의 위치 리턴
		System.out.println(s.indexOf('i')); // 2
		
		// indexOf : 5번 인덱스포함 이후에 문자나 문자열의 위치 리턴.
		System.out.println(s.indexOf('i',5)); // 5
	
		// indexOf : 15번 인덱스포함 이후에 문자나 문자열의 위치 리턴.
		System.out.println(s.indexOf('i',15)); // -1 15번이후 문자열 없음
		System.out.println(s.indexOf("is")); // 2
		System.out.println(s.indexOf("is",3)); // 5
		System.out.println("\t");
		
		// lastIndexOf : 뒤쪽부터 검색하여 문자나 문자열의 위치 리턴
		System.out.println(s.lastIndexOf("is")); // 5
		System.out.println(s.length()); // 16 문자열의 길이
		
		//replace : 치환 is => QR문자열로 치환.
		System.out.println("================"+"\n"+s);
		s=s.replace("is", "QR"); // s.replace는 값이 안바뀐다. 's=' 주소를 붙여줘야함
		System.out.println(s);
		System.out.println("------------------------");
		
		// substring : 부분 문자열 리턴
		// 5번 인덱스 붙 이후를 부분문자열로 리턴
		System.out.println(s.substring(5));
		// 5번 인덱스부터 13번 인덱스 앞까지를 부분문자열로 리턴(5~12 인덱스)
		System.out.println(s.substring(5,13));
		System.out.println(s.toLowerCase()); // 전부 소문자로
		System.out.println(s.toUpperCase()); // 전부 대문자로
		// trim() : 양쪾 공백 제거.
		System.out.println("["+"   문자열 trim 메서드       ".trim()+"]");
		
		System.out.println("=========="+"\n"+s);
		s=s.replace("QR", "is");
		System.out.println(s);
		
		
	
	}}
