package ch04_control;

import java.util.Scanner;

/*	
숫자를 입력하세요 
8
***************
 ************* 
  ***********  
   *********   
    *******    
     *****     
      ***      
       *       
      ***      
     *****     
    *******    
   *********   
  ***********  
 ************* 
***************
*/	

public class Ex_control_18 {

	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 ");
			int num = scan.nextInt();
			int start = 1;
			int end = 2*num -1;	

			for(int i=1; i<=(2*num-1); i++) {
				for(int j=1; j<=(2*num-1); j++) {

				if(start<=j && end>=j) 
				{	System.out.print("*");}
				else{ 
					System.out.print(" ");
				}
				}
				if(i<num) {start++;end--;}
				else {start--;end++;}
				// i 값이 별하나에 오고나서 음수가 될수 없으니 증감식을 + - 를 바꿧다.
				// i값이 num보다 작을때; 
				System.out.println();
				
			}
			
	}

}
