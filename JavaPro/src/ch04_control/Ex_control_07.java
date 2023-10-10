package ch04_control;
//(1) + (1+2) + (1+2+3) + ... (1+2+3+....+10)=220 출력
public class Ex_control_07 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.print("(");
			for(int j = 1; j<=i; j++) {
				System.out.print(j+((i==j)?"":"+"));  // i==j 일 경우 ""를 찍고 아니면"+"를 찍는다
				sum +=j;
			}
			System.out.print(")"+((i==10)?"=":"+"));  // i==10 일 경우 "="을찍고 아니면"+"를 찍는다 
		}
		System.out.println(sum);
	}

}
