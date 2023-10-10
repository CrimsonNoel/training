package ch12_API;
/*
 * String은 값의 대입에 따라 주소가 설정됨
 * str의 주소가 값의 입력에 따라 바귄다.
 */
public class String_Ex_04 {

	public static void main(String[] args) {

		String str = "ABC";   // 100주소 리터럴값이 같기에 주소가같음??.
		String str1 = "ABC";  // 100주소
			
		System.out.println("1)str hashcode():"
						+System.identityHashCode(str)+" , "
						+System.identityHashCode(str1));
		
		System.out.println("main : "+ str);
	
		change(str); // 주소 설정 하지않음
		System.out.println("2)str hashcode() : "
						+System.identityHashCode(str)+" , "
						+System.identityHashCode(str1));
		System.out.println("change 이후 main 재설정 안함 : " + str);
		
		str = change(str); // 주소 재설정
		System.out.println(
						"3) str 주소 재설정 hashcode() : "
						+ System.identityHashCode(str)+" , "
						+ System.identityHashCode(str1));	}

		static String change(String str) {
			str += 456; // 여기서 주소가 변경된다
			System.out.println("change() s : "+str+" : ");
			return str;
		}
	
	
	}
