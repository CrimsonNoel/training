package ch05_array;
/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 * [결과]
 * 0row(행)의합:1
 * 1row(행)의합:30
 * 2row(행)의합:120
 * 3row(행)의합:300
 * 4row(행)의합:400
 * 0column(열)의합:161
 * 1column(열)의합:200
 * 2column(열)의합:210
 * 3column(열)의합:180
 * 4column(열)의합:100 
 */
public class Ex_Array_07 {

	public static void main(String[] args) {
		int arr[][] = {{1},{10, 20},{30, 40, 50},{60, 70, 80, 90},{60, 70, 80, 90, 100}};
		
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			System.out.print(i+"row(행)의 합 : ");
			for(int j=0; j<arr[i].length;j++) {
				sum += arr[i][j];
			}
			System.out.print(sum);
			System.out.println();
		}
		
				
		
		
	}

}
