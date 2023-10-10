package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/* 혼자 처음으로 짜본듯 나이스
 * 홀수 개의 숫자를 list에 입력 받아서 add후 sort해서 숫자의 평균과 중간 값을 출력하기
 * 10 40 30 60 30
 * 10 30 30 40 60
 * 
 * 평균값 : ...
 * 중간값 : 30 (홀수 개의 가운데값)
 */
public class Ex_Collection_01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 홀수의 갯수 만큼 입력하세요.(종료:0)");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while(true) {
			int num = scan.nextInt();
			sum +=num;
			if(num>0){
				list.add(num);
				System.out.println("입력한 숫자: "+list);	}
			
			if(list.size()%2==0 && num==0) {
				System.out.println("숫자를 하나더 입력하세요.");
				continue;			}
			if(num == 0) {
				break;
			}}
		Collections.sort(list);	
			
		
		System.out.println("숫자 평균: "+(double)sum/list.size());
		System.out.println("중간 숫자: "+list.get(list.size()/2));
	

	}}
