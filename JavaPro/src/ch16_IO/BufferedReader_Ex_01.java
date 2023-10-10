package ch16_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 보조 스트림 : 다른 스트림을 이용하여 새로운 기능 추가하는 기능을 가진 스트림
 *            객체 생성시 다른 스트림을 매개변수로 입력받는다.
 *  BufferedReader : 버퍼를 내부적 추가하여 IO 성능 향상시키는 스트림.
 *  => readLine() 메서드를 이용하여 한줄씩 읽을 수 있는 기능 추가.
 *  new BufferedReader(Reader) 객체 생성 가능
 *  
 *  키보드에서 한줄씩 읽어서 화면에 출력하고, buffered.txt 파일에도 저장하기. 
 */
public class BufferedReader_Ex_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f = new File("src/ch16_IO/buffered.txt");
		f.createNewFile();		
		FileWriter fw = new FileWriter("src/ch16_IO/buffered.txt");
		String data = null;
		while((data = br.readLine())!= null) {  // ctrl+z 종료되면서 파일에 입력됨. Scanner 같
			System.out.println(data);
			fw.write(data+"\n");
		}
		//fw.flush();
		fw.close();
		
		
	}

}
