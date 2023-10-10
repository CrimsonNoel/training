package ch05_array;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[32];
		System.out.println("변환할 2진수를 입력하세요");
		int num = scan.nextInt();
		int digit=2;
		int divnum = num;
		int index = 0;
		
		while(divnum !=0) {
			arr[index++]=divnum%digit;
			divnum /=digit;
		}
		System.out.print(digit+"진수의 값은 : ");
		for(int i= index-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
	}	
}
