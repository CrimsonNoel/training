package ch05_array;
/* 해답
 * 5명 학생의 국어,영어,수학 점수를 학생별로 총점, 평균을 출력하고
 * 과목별 총점과 평균 출력하기
 * [결과]
 * 			국어 영어 수학 총점 평균
 * 1번학생 : 100  80  90 270 90.0..
 * 2번학생 :  80  95 100 275 90.0..
 * ...
 * 과목총점 : 400 350 430
 * 과목평균 : 90.? 90.? 90.??
 */
public class Ex_Array_06_ {

	public static void main(String[] args) {

		int score[][] = {
	              {100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}
	            };
		int total[] = new int [3];
		
		
		System.out.println("\t국어"+"\t영어"+"\t수학"+"\t총점"+"\t평균");
		System.out.println();
		
		for(int i=0; i<score.length;i++) {
			System.out.print(i+1+"번학생 : ");
			int sum = 0;
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];      // 학생별 합계
				total[j] += score[i][j]; // 과목별 합계
			}
		System.out.printf("%d \t %.2f \n", sum,(double)sum/score[i].length);
					
		}
		System.out.print("과목총점 :\t");
		for(int i=0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
			}
		System.out.println();
		System.out.print("과목평균 :\t");
		for(int i=0; i<total.length;i++) {
			System.out.printf("%.2f \t",(double)total[i]/score.length);
		}
		
		
		// result[i][j] = i,j index값 가져와서 하는건데 가독성떨어지고 불편함..에러못고쳤다.
		System.out.println("\n===================================");
			System.out.println("\t"+"    국어"+"  영어"+"  수학"+"  총점"+"  평균");
		int[][] result = new int[score.length+1][score[0].length+1];
			
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j];
				result[score.length][j] += score[i][j];
				result[score.length][score[i].length] += score[i][j];
				}
		}
			for(int i=0; i<result.length; i++) {
				System.out.print(i+1+"번 학생 : ");
				for(int j=0; j<result[i].length; j++) {
					System.out.printf("%5d",result[i][j]);
				}
			System.out.printf("  %.2f",(double)result[i][score[i].length]/score[i].length);	
			//통짜로 찍을려다가 문제생김. %.2f ??
			
			System.out.println();
			}
			System.out.print("     ");
			for(int j=0; j<result[score.length].length-1;j++) {
			System.out.printf("%10d",result[score.length][j]);
			}
			System.out.println();
			}
			
		
	
	
	
	

}