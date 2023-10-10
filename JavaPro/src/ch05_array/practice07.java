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
public class practice07 {

	public static void main(String[] args) {
		int arr[][] = {{1},{10, 20},{30, 40, 50},{60, 70, 80, 90},{60, 70, 80, 90, 100}};
		int row[] = new int[arr.length];
		int mcol = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(mcol<arr[i].length) {
				mcol=arr[i].length;
			}
			System.out.println(mcol);
		}
		
		int col[]=new int[mcol];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				row[i] += arr[i][j];
				col[j] += arr[i][j];
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"row의 합: "+row[i]);
		}
		System.out.println();
	
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+"col의 합: "+col[i]);
		}
				
		
	}

}
