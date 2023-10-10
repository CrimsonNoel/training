package ch05_array;
/*
 * 1부터 9까지 숫자 중 중복되지 않는 3까지 숫자를 임의로 생성하는 프로그램 작성하기
 */
public class Ex_Array_04 {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// 복잡하게 생각하지 말고 1~9 들어잇는 배열하나 만들어서 뽑아쓰면된다. 
		// 뽑는순간 그 수는 없으니 중복 될 수가없다.
		// 셔플식
		for(int i=0; i<10000; i++) {
			int f =(int)(Math.random()*9);
			int t =(int)(Math.random()*9);
			// arr[f], arr[t], 바꾸기
			int temp = arr[f];
			arr[f] = arr[t];
			arr[t] = temp;
		}
		for(int j=0; j<3; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
				
		
	}

}
