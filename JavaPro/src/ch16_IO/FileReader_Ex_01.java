package ch16_IO;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 예제 : FileReader 클래스는 파일을 1 char(2 byte) 단위로 읽는 기능
 *    int read() : 파일을 1char 단위로 읽어 리턴
 *    int read(char[] buf) : buf 크기만큼 데이터를 읽어서 buf에 데이터를 저장.
 *     실제로 읽은 바이트수 리턴
 *    int read(char[] buf, int start, int len) :
 *                데이터를 len 문자 만큼 읽어서 buf에 start 인덱스 부터 저장. 
 *                실제 읽은 바이트수 리턴  
 */
public class FileReader_Ex_01 {

	public static void main(String[] args) throws IOException{
		String fileName = "src/ch16_IO/FileReader_Ex_01.java";
		FileReader fis = new FileReader(fileName);
		System.out.println("********************read() 메서드를 이용하여 읽기");
		int data = 0;
		while((data = fis.read())!= -1) {
			System.out.println((char)data);
		}
		System.out.println();
		
		fis = new FileReader(fileName);
		System.out.println("**********read(char[] buf) 메서드를 이용하여 읽기");
		char[] buf = new char[1024];
		
		while((data = fis.read(buf))!=-1) {
			System.out.println(new String(buf, 0, data));
		}
	}

}
