package ch05_array;

import java.util.Scanner;

public class Array_Ex_04 {
/*
 * 10 진수를 원하는 진수로 변경하기
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			int arr[] = new int[32];
			System.out.println("변환할 10진수를 입력하세요");
			int num = scan.nextInt();
			int digit=8; //변환할 진수
			// A:10, B:11 ....
			int divnum = num;
			int index = 0;
			while(divnum !=0){
				arr[index++]=divnum%digit;
				divnum/=digit;
			}
			System.out.print(num+"을 "+ digit+"진수 변환 : ");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		
			System.out.println(Integer.toBinaryString(num));
			System.out.println(Integer.toOctalString(num));
			System.out.println(Integer.toHexString(num));
	}

}
