package ch04_control;
/*
 * 
 *
 *
 *
 */


public class Loop_Ex_06 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		// Math.random(); 		: 0<= Math.random() <1
		// *10            		: 0<= 			    <10
		// (int)(Math.random()*10): 0<=     int값      <10
		
		int row = (int)(Math.random()*10)+1;
		int col = (int)(Math.random()*10)+1;
		System.out.println("row : "+row+ " col : "+col);
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
