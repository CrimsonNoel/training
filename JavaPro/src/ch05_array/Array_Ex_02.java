package ch05_array;

public class Array_Ex_02 {
/*
 * 배열의 선언, 생성시 초기화를 하는 예제 
 */
	public static void main(String[] args) {
		
		// 배열의 선언+생성+초기화를 한번에
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int a: arr) {
			System.out.print(a+",");
		}
		System.out.println();
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]"+arr[1]);
		}
		System.out.println();
		// 생성+초기화
		arr = new int[]{100, 200, 300};
		for (int a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
	}

}
