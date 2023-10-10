package ch16_IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_Ex_01 {

	public static void main(String[] args) {
		String fileName = "src/ch16_IO/sample.dat";
		try{
			FileInputStream fis = new FileInputStream(fileName);
			DataInputStream dis = new DataInputStream(fis);
			File f = new File(fileName);
			System.out.println("file length: "+f.length());
			
			System.out.println(dis.readInt());  // 저장한 타입 ==  읽는 타입. 순서가 같아야한다.
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			//10, 20.0f, true
			
			dis.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
