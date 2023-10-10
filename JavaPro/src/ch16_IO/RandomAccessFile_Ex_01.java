package ch16_IO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_Ex_01 {

	public static void main(String[] args) {
			
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("test.dat", "rw");
			System.out.println("파일 포인터의 위치: "+raf.getFilePointer());
			raf.writeInt(100); // 4byte ?
			System.out.println("파일 포인터의 위치: "+raf.getFilePointer());
			raf.writeLong(100L); // 8byte?
			System.out.println("파일 포인터의 위치: "+raf.getFilePointer());
			
		}catch(IOException e){
			e.printStackTrace();
		}
			
	}

}
