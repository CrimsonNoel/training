package ch05_array;

public class Ex_Array_02 {
	/*
	 * Math.random() 함수를 이용하여 1부터 10까지의 임의의 수를 배열에 10개 저장하기
	 * 배열에 저장된 수만큼 * 를 출력하기
	 *  0 <= Math.random() < 1.0
	 * arr= {3,5,2,1...}
	 * 3:***
	 * 5:*****
	 * 2:**
	 * ...
	 */

	public static void main(String[] args) {
		int[] arr= new int[10];
		int[] array = new int[10];
		arr=array;      // arr값 변하지말라고 array를 새로 만들엇는데 여기선 의미없다.
		for(int i=0; i<arr.length; i++) {
			System.out.print((arr[i]=(int)(Math.random()*10+1))+" : ");
			for(int j=0; j<array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		arr[0] = (int)(Math.random()*10+1);
//		arr[1] = (int)(Math.random()*10+1);
//		arr[2] = (int)(Math.random()*10+1);
//		arr[3] = (int)(Math.random()*10+1);
//		arr[4] = (int)(Math.random()*10+1);
//		arr[5] = (int)(Math.random()*10+1);
//		arr[6] = (int)(Math.random()*10+1);
//		arr[7] = (int)(Math.random()*10+1);
//		arr[8] = (int)(Math.random()*10+1);
//		arr[9] = (int)(Math.random()*10+1);
		
//		for(int i:array) {
//			System.out.print(i+",");
//		}
//		for(int i=0; i<array.length; i++) {
//			System.out.println();
//			for(int j=0; j<array[i]; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
	}

}
