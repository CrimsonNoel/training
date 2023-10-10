package ch05_array;
/* 해답
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
public class Ex_Array_07_ {

	public static void main(String[] args) {
		int arr[][] = {{1},{10, 20},{30, 40, 50},{60, 70, 80, 90},{60, 70, 80, 90, 100}};
		
		int trow[] = new int[arr.length];
		int maxcol = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
			System.out.println(maxcol);
		}
		
		int tcol[] = new int[maxcol];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				trow[i] += arr[i][j];
				tcol[j] += arr[i][j];
			}
			System.out.println(i+"row(행)의 합 : "+ trow[i]);
		}
		for(int i=0; i<tcol.length; i++) {
			System.out.println(i+"column(열)의 합 : "+tcol[i]);
		}
		
		
	}

}
