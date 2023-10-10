package ch12_API;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Scanner 이용하여 File 정보 읽기
public class Scanner_Ex_01 {

	public static void main(String[] args) {
		// File : 파일의 정보를 저장하는 클래스
		Scanner scan = null;
		try {
			scan = new Scanner(new File("src/ch12_API/score.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int cnt = 0;		// 인원수
		int totalSum = 0;	// 전체합계
		
		while(scan.hasNextLine()) { //  scan에 있는걸 한줄씩 읽어라.
			String line = scan.nextLine();
//			System.out.println(line);
			Scanner scan2 = new Scanner(line).useDelimiter(",");
			String name = scan2.next();
			System.out.print(name+":"+"\t");
			int sum=0;
			int i=0;
			while(scan2.hasNextInt()) {
				int score = scan2.nextInt();
				sum+=score;
				System.out.print(score+"\t");							
				i++;
				
				}	
			System.out.println("sum = "+sum+", avg"+(double)sum/i);
			totalSum += sum;
			cnt++;
		}
		System.out.println("인원수 : "+cnt+" 합계 : "+totalSum);
	}}
