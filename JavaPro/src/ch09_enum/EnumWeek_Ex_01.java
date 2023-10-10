package ch09_enum;

import java.nio.file.spi.FileSystemProvider;
import java.util.Calendar;
enum Week{MONDAY,TUSEDAY,WENSEDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};

public class EnumWeek_Ex_01 {					// 날짜 관련해서 가독성 좋은 친구
	public static void main(String[] args) {
			Week today = null;
			Calendar cal = Calendar.getInstance();  // 오늘 날짜 return; // Calender 클래스는 뉴안됨
			int week = cal.get(Calendar.DAY_OF_WEEK); // 요일을 int로 return하는 식. 외우면좋다.
			System.out.println(week);
			switch(week) {
			case 1:		today = Week.SUNDAY;		break;
			case 2:		today = Week.MONDAY;		break;
			case 3:		today = Week.TUSEDAY;		break;
			case 4:		today = Week.WENSEDAY;		break;
			case 5:		today = Week.THURSDAY;		break;
			case 6:		today = Week.FRIDAY;		break;
			case 7:		today = Week.SATURDAY;		break;			}
			
			System.out.println("오늘 요일: "+ today +","+today.ordinal());
			if(today == Week.SUNDAY) {
				System.out.println("일요일에는 축구를 합니다.");
			}else {
				System.out.println("열심히 자바 공부를 합니다.");			}
		}	
}
