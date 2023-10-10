package ch16_IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Ex_01 {
	/*
	 * FileWriter 예제
	 *   : 파일에 데이터 출력
	 *   void write(int data) : data 중 1문자를 파일로 출력
	 *   void write(char[] buf) : buf의 내용을 파일로 출력 
	 *   void write(char[] buf,int start, int len) : buf의 start 인덱스 부터 
	 *                                               len바이트 만큼 내용을 파일로 출력 
	 *   void write(String buf) : buf의 내용을 파일로 출력 
	 */
	public static void main(String[] args) throws IOException {
		FileWriter fos = new FileWriter("src/ch16_IO/out02.txt");
		fos.write('1'); fos.write('2'); fos.write('3');fos.write('a');fos.write('b');
		fos.write('c'); fos.write('가'); fos.write('나');fos.write('다');
		//getBytes() : 문자열을 byte[]로 리턴
		char[] buf = "\n반갑습니다. FileOutputStream 예제 입니다. \n".toCharArray();
		fos.write(buf);
		fos.write(buf, 1, 6); // 0행 부터 하면 \n 이 실행된다.
		System.out.println((int) '\n');
		fos.write('\n');
		fos.write("안녕.");
		fos.flush();
		
		
	}

}
