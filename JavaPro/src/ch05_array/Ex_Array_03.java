package ch05_array;
/*
 * 1 ~ 10사이의 임의의 수를 만들어서
 * 각 수가 나온만큼 "*" 출력하기
 * 1 1 2 2 3 3 5 6 8 9
 * 1 : **
 * 2 : **
 * 3 : **
 * 4 :
 * 5 : *
 * 6 : *
 * 7 : 
 * 8 : *
 * 9 : *
 * 10 :
 * 
 */
public class Ex_Array_03 {

	public static void main(String[] args) {

		int[] arr = new int [10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		for(int i :arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i=0; i <arr.length; i++) {
			System.out.print(i+1+" ");
			for(int j=0; j<arr.length; j++) {
				if(i+1==arr[j])System.out.print("*");
			}   //arr[j] 값이 i랑 같을경우에만 별을 찍어라.
		System.out.println();
		}
		
		
	}

}
