
package ch04_control;
/*
 * switch 구문에 사용되는 자료형
 * 	=> byte, short, int, char, String
 * 
 * switch 구분에 사용 불가능한 자료형
 *  => boolean, long, float, double
 * 
 * 조건문 : if, switch
 * 	  모든 switch 구문은 if문으로 변경 가능함
 * 	  모든 if 구문은 switch로 변경 불가능
 *    일부만 가능하다 
 */
public class Switch_Ex_02 {

	public static void main(String[] args) {
		String value = "1";
		switch(value) {
		//범위 지정 안됨
		case "1"  : System.out.println(value); break;
		case "2"  : System.out.println(value); break;
		default  : System.out.println(value); break;
		}
		
		int value2 = 1;
		switch(value2) {
		//범위 지정 안됨.
		case 1   : System.out.println(value); break;
		case 2   : System.out.println(value); break;
		default   : System.out.println(value); break;
		}
		
		
		
		
		
		
	}

}
