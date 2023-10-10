package ch12_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스 예제
 * 
 * SimpleDateFormat : 형식화 클래스.
 *   String format(Date) : Date 타입의 객체를 형식화된 문자열로 변경하여 리턴.
 *   Date   parse(String) : 형식화된 문자열을 Date 객체로 리턴
 */

//SimpleDateFormat : 날짜를 문자열 변경,
//                   문자열 날짜로 변경 기능.
/*
 * yyyy : 년도는 4자리 출력
 * MM   : 월
 * dd   : 일자
 * HH   : 0 ~ 23시,
 * hh   : 1 ~ 12시  
 * mm   : 분
 * ss   : 초
 * E    : 요일
 * a    : 오전, 오후
 */
public class Date_Ex_01 {
	public static void main(String[] args) {
			Date now = new Date(); // 현재시간 객체를 확인
			System.out.println(now);
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss E a");
			String dispDate = sf.format(now); //format 이면 Date --> String
			System.out.println(dispDate);
			
			System.out.println();
			
			String strDate = "2023-06-01";
			SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd");
			Date day = null;
			try {
				day = sf2.parse(strDate); // parse 이면 String -> Date
			}catch(ParseException e1){
				e1.printStackTrace();
			}
			System.out.println(day);
			System.out.println(sf.format(day));
	
	//문제 : 2019년 12월 31일의 요일 출력하기
	// 		단 입력 값은"2019년12월31일" 형태로
	//			출력값은 "2019-12-31 날짜의 요일은 ??요일입니다."
	strDate="2019년12월31일";   // String으로 입력받고
	SimpleDateFormat sf3 = new SimpleDateFormat("yyyy년MM월dd일");
	try {
		day = sf3.parse(strDate); // String을 Date로 변경
	}catch(ParseException e) {
	e.printStackTrace();}
	SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd 날짜의 요일은 E요일 입니다.");
	System.out.println(sf4.format(day));
	
	
	
	
	
	
	}}
