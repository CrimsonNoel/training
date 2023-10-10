package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List_Ex_03 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	
		   System.out.println("숫자를 입력하세요.(종료:0)");
		   int sum =0;
		   List<Integer> li = new ArrayList<Integer>();
		   
		   while(true) {
			   int num = scan.nextInt();
			   if(num%2==1){
				   li.add(num);
				   sum+=num;
		   }else if(num == 0) {
			   break;
		   }
			System.out.println("입력된 홀수: "+li);
		 }
		   System.out.println("총합"+sum);
		   System.out.println("최대값 : "+Collections.max(li)+
				   "  indexOf : "+li.indexOf(Collections.max(li))); 
		   System.out.println("최소값 : "+Collections.min(li)+
				   "  indexOf : "+li.indexOf(Collections.min(li))); 
		}}
