package ch05_array;

public class Array_Ex_01 {

	
	public static void main(String[] args) {
	// 1. 배열 참조 변수 선언
		int[] arr1;
		int arr2[]; 
	// 2. 배열 객체 생성(instance)
		arr1 = new int[5];
		arr2 = new int[5]; //int형 저장공간을 5개 생성. 기본값(0)으로 초기화
	// 3. 배열값을 초기화
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
	    arr2 = arr1;  // 간단히보면 배열이 같다 라고 볼수있지만,intance arr1 = arr2가 되버렷다. 주소가 같아짐.
	    			  // arr2 가 읽는건 arr1과 같은 배열의 arr2의 주소가아니라 arr1의 주소자체를 읽는게 됨
	    arr2[4] =50;
	    
	// 4. 배열 출력
	    System.out.println("arr1 배열 : ");
			for(int i=0; i<arr1.length; i++) {
				System.out.println("arr1[" +i+ "]=" +arr1[i]);
			}
			System.out.println("arr2 배열 : ");
			for(int i=0; i<arr2.length; i++) {
				System.out.println("arr2[" +i+ "]=" +arr2[i]);
			}
			arr1[3] = 777; 
			System.out.println("arr2 배열 : ");
			for(int i=0; i<arr2.length; i++) {
				System.out.println("arr2[" +i+ "]=" +arr2[i]);
			}
			
			// 향상된 for문으로 출력해보자.
			System.out.println("arr2 배열 : ");
			for(int a : arr1) {
				System.out.print(" "+a);
			}
			
	}
}
