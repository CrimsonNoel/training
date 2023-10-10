package ch05_array;
/*
 * 11 사이즈의 배열에 0~9 수를 2번 중복 하여 넣고 나머지는 1번 넣어서 배열의 내용을 프린트하세요
 * 예) {7, 5, 6, 0, 8, 7, 4, 6, 0, 8, 2} 순서는 상관없음
 */
public class Ex_Array_09 {

	public static void main(String[] args) {
	
		int answer[] = new int[11];
		int num[] = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i]=i;
		}
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random()*10);
			int t = (int)(Math.random()*10);
			int temp = num[f]; 
			num[f] = num[t];
			num[t] = temp;
		}
		
		System.arraycopy(num, 0, answer, 0, 5);
		System.arraycopy(num, 0, answer, 5, 5);
		
		answer[10] = num[5];
		for(int ans : answer) {
			System.out.print(ans+",");
		}
		
	
	
	}

}
