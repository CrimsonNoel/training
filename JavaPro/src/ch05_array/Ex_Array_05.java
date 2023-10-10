package ch05_array;
/*
 * 1부터 100까지 임의의 수 10개를
 * 배열에 저장하고, 정렬하여 출력하기
 * 단 Arrays.sort() 매서드는 사용하지 않기.
 */
public class Ex_Array_05 {

	public static void main(String[] args) {

		int[] arr = new int [10];
		
		for(int i = 0; i<10; i++) {
			arr[i]=(int)(Math.random()*100+1);
			System.out.print(arr[i]+",");
		} System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			boolean change = false;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					change = true;
					}
				
				}
			if(!change)break;
			
			}
		for(int a : arr) { System.out.print(a+",");}
		}
	}


