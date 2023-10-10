package ch12_API;
// Character 클래스
public class Wrapper_Ex_03 {
	public static void main(String[] args) {
			char[] data = {'A','a','4','&'};
			for(char c : data) {   // char 단위
				if(Character.isUpperCase(c)){
					System.out.println(c+" : 대문자임");
				}else if(Character.isLowerCase(c)) {
					System.out.println(c+" : 소문자임");
				}else if(Character.isDigit(c)) {
					System.out.println(c+" : 숫자임");
				}else {
					System.out.println(c+" : 일반문자임");				}}
			
				Character ch = 'A'; //boxing
				System.out.println(ch.equals('A')); // true
				System.out.println(ch=='A'); // true
				System.out.println(Character.isAlphabetic('A')); // true
				System.out.println(Character.isAlphabetic('a')); // true
				System.out.println(Character.isAlphabetic('가')); // true
				System.out.println(Character.isAlphabetic('1')); // false
				
				
	}}


