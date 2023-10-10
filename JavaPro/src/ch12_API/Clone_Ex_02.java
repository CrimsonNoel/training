package ch12_API;

import java.util.Arrays;

public class Clone_Ex_02 {

	public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4 ,5};
			// 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
			int[] arrClone = arr.clone(); // Clone자체가 다른주소에서 생성.
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arrClone));
			System.out.println(arr==arrClone);
			arrClone[0]=6;
			
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arrClone));
			System.out.println(arr==arrClone);
	}

}
