package ch04_control;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력하세요
 * 8
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 * ***************  
 * 
 * 
 * 
 */
public class Ex_control_12 {

	public static void main(String[] args) {
		
		System.out.println("삼각형의 높이를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		
		
		for(int i = 1; i<=len; i++) {
			for(int j=1; j<=(len*2-1); j++) {
				if(j>len-i && j< len+i)           //행을 한번더 작성(*2)하는게아니라 범위로 입력한다 안한다를 조절
					{System.out.print("*");}
				else 
					{System.out.print(" ");}
							
				}
			System.out.println();
		}
		
		
		
	}

}
