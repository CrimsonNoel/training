package ch05_array;

import java.util.Scanner;

/*
 * 숫자를 입력받아 [10][5]크기에 "*"로 숫자를 출력하세요.
 */
public class Ex_Array_10 {

	
		
		public static void main(String[] args) {
		      String neonNumber[][] = {
		            { "*****", "*   *", "*   *", "*   *", "*****" },
		            { " **  ", "  *  ", "  *  ", "  *  ", " *** " }, 
		            { "*****", "    *", "*****", "*    ", "*****" },
		            { "*****", "    *", "*****", "    *", "*****" }, 
		            { "  ** ", " * * ", "*  * ", "*****", "   * " },
		            { "*****", "*    ", "*****", "    *", "*****" },
		            { "*****", "*    ", "*****", "*   *", "*****" },
		            { "*****", "*   *", "*   *", "    *", "    *" }, 
		            { "*****", "*   *", "*****", "*   *", "*****" },
		            { "*****", "*   *", "*****", "    *", "    *" } };

		      String temp = " ";
		      Scanner scan = new Scanner(System.in);
		      while (true) {
		         System.out.println("1 에서 9 까지의 숫자를 입력하세요." + " 끝내려면 -1  입력하세요.");
		         temp = scan.next();

		         if (temp.equals("-1")) {
		            System.out.println("end");
		            break;
		         }

		         System.out.println("입력값 : " + temp);
		         
		         for(int i=0; i<5; i++) {
		        	 for(int j=0; j<temp.length();j++) {
		        		 char ch =temp.charAt(j);
		        		 System.out.print(neonNumber[ch-48][i]+"\t");
		        	 }
		          System.out.println();
		          }
		        	
		         }
		
	}

}
