package ch05_array;

import java.util.Scanner;

/*
 * 2차원 배열을 이용하여 모래시계 출력하기
 * 배열의 크기를 홀수개로 입력하세요
 * 
 * 홀수개의 배열 크기를 입력하세요
 */
public class Ex_Array_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 배열 크기를 입력하세요");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int number=0;
		int left = 0;
		int right= num-1;
		boolean chk = true;
		
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(left<=j && right>=j)
				{matrix[i][j]=++number;}
			}
			if(left==right) 
				chk=false;
			if(chk) {
				left++; right--;
			}else {
				left--; right++;
				}
		}
		
//		for(int i=0; i<matrix.length; i++) {
//			for(int j=0; j<matrix.length; j++) {
//				if(matrix[i][j]>9) {
//					System.out.print(matrix[i][j]+" ");
//				}else if(matrix[i][j]>0) {
//					System.out.print(matrix[i][j]+"  ");
//				}else {
//					System.out.print("   ");
//				}
//				
//		}System.out.println();
//		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length;j++) {
				if(matrix[i][j]>0) {
					System.out.print(matrix[i][j]+(matrix[i][j]>9?" ":"  "));
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();			
			}
			
		
		
		
	
	
	
	}

}
