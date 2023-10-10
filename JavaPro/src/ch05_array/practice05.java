package ch05_array;
/*
 * 1부터 100까지 임의의 수 10개를
 * 배열에 저장하고, 정렬하여 출력하기
 * 단 Arrays.sort() 매서드는 사용하지 않기.
 */
public class practice05 {

	public static void main(String[] args) {

		int arr[] = new int [10];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		for(int i : arr) {
			System.out.print(i+",");
		}
		for(int i=0; i<arr.length; i++) {
			boolean ck = false;
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					ck=true;
				}
			}
			if(!ck)break;
			System.out.print("\n");
		}
		for(int b :arr) {System.out.print(b+",");
		
		
	}

	}}

