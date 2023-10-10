package ch05_array;
/*
 * Ex_Array_02 해답
 */
public class Ex_Array_02_ {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
//		for(int i : arr) {
//			System.out.print(i+",");
//		}
//		
		for(int a : arr) {
			System.out.print(a+":");
			for(int i=0; i<a; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
