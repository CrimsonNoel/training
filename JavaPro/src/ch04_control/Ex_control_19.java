package ch04_control;

import java.util.Scanner;

/*
 * 	
8
       *       
      ***      
     *****     
    *******    
   *********   
  ***********  
 ************* 
***************
 ************* 
  ***********  
   *********   
    *******    
     *****     
      ***      
       *       


*/	
public class Ex_control_19 {

	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 ");
			int num = scan.nextInt();
			int start = num;
			int end = num;	

			for(int i=1; i<=(2*num-1); i++) {   // 기준점,시작점에서 출발
				for(int j=1; j<=(2*num-1); j++) {

				if(start<=j && end>=j)           // 왼쪽start감소 오른쪽end증가하다가 
				{	System.out.print("*");}
				else{ 
					System.out.print(" ");
				}
				}
				if(i<num) {start--;end++;}
				else {start++;end--;}
				 
				System.out.println();								 //증가 감소로 변하는 분기점
				
				
			}
			
	}

}
