package ch12_API;
/*
 * 숫자형 문자열 숫자로 변경
 */
public class Wrapper_Ex_02 {
	public static void main(String[] args) {
		int is = Integer.parseInt("123");
		System.out.println(is); // 123
		is = Integer.parseInt("123",8);// 123을 8진수로
		System.out.println(is); //83
		is = Integer.parseInt("123",16);// 123을 16진수로
		System.out.println(is);	
		
		float f = Float.parseFloat("123.45");
		System.out.println(f); // 123.45
		f = Float.parseFloat("123.45f");
		System.out.println(f); // 123.45
		double d = Double.parseDouble("123.45");
		System.out.println(d);
		
		System.out.println(Integer.toBinaryString(500));// 10진수를 다른 진수로 수정
		System.out.println(Integer.toOctalString(500));
		System.out.println(Integer.toHexString(500));
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
	}}
