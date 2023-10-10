package ch16_IO;

import java.io.File;

/*
 * File 클래스 예제
 *  - 파일이나 폴더의 정보를 관리하는 클래스
 *  - file이 없어도 객체는 만들어짐
 */
public class File_Ex_01 {

	public static void main(String[] args) {

		String filePath = "c:\\Program Files"; // \ 한줄이면 에러난다
		File f1 = new File(filePath);
		String files[] = f1.list();
		for(String f : files) {
			File f2 = new File(filePath,f);
			if(f2.isDirectory()) // 종류가 폴더인지 확인
				System.out.printf("%s : 디렉토리%n", f);
			else if(f2.isFile())  //종류가 파일인가
			System.out.printf("***"+"%s : 파일(%,dbty)%n",f,f2.length());
		}
		
		
		
	}

}
