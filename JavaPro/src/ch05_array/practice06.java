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
public class practice06 {

	public static void main(String[] args) {
		
		int score[][] = {
	              {100,80,90},{80,95,100},{60,65,70},{85,70,75},{90,90,80}
	            };
		int total[] = new int [3];
		int sum = 0;
		
		
		System.out.println("\t국어"+"\t영어"+"\t수학"+"\t총합"+"\t 평균");
		for(int i=0; i<score.length; i++) {
			sum=0;
			System.out.print(i+1+"번 학생: ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				total[j] += score[i][j];
			}
			System.out.print(sum);
			System.out.printf("\t %.2f ",(double)sum/3);
		System.out.println();
		}
		System.out.print("과목 총합: ");
		for(int i=0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
		}
		
		
	}
}
