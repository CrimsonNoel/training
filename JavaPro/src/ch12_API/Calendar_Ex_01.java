package ch12_API;

import java.util.Calendar;

enum Week{SUNDAY,MONDAY,TUSEDAY,WENSEDAY,THURSDAY,FRIDAY,SATURDAY};
public class Calendar_Ex_01 {
	public static void main(String[] args) {
			int year = 2023;		int month = 6;
			Calendar sDay = Calendar.getInstance();	// 시작일
			Calendar eDay = Calendar.getInstance(); // 끝일
//			Calendar sDay1 = new Calendar(); // error 싱글톤은 아닌데 
										//Calendar.getInstance();로만 받게해놨다.
			
			// 월의 경우 0 부터 11까지의 값을 가지므로 1을 뺴주어야 한다.
			// 예를 들어, 2023년 6월 1일은 sDay.set(2023,5,1);과 같이 해줘야 한다.
			sDay.set(year, month-1,1);  //
			eDay.set(year, month,1);    // 2023,7,1
			// 다음달의 첫날에서 하루를 뺴면 현재달의 마지막 날이 된다.
			// 12월 1일에서 하루를 뺴면 11월 30일이 된다.
			eDay.add(Calendar.DATE, -1);
			
			// 첫 번쨰 요일이 무슨 요일인지 알아낸다.
			int START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			
			// eDay에 지정된 날짜를 얻어온다.
			int END_DAY = eDay.get(Calendar.DATE);
			Week[] days = Week.values();
			System.out.println("1일의 요일 : "+days[START_DAY_OF_WEEK-1]);
			System.out.println("마지막 일 : "+END_DAY);	
	
			System.out.println("       "+year+"년 "+month+"월");
			System.out.println(" SU MO TU WE TH FR SA");
			// 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
			// 만일 1일이 수요일이라면 공백을 세 번 찍는다.(일요일부터 시작)
			
			for(int i=1; i<START_DAY_OF_WEEK;i++) {
				System.out.print("   ");			}
			for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++,n++) {
				System.out.print((i<10)?"  "+i:" "+i);
				if(n%7 == 0)
					System.out.println();
			}
	}

}
