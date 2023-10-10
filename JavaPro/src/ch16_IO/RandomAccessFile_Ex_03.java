package ch16_IO;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFile_Ex_03 {

	public static void main(String[] args) {
			int sumkor = 0;
			int sumeng = 0;
			int summath = 0;
			
			try {
				RandomAccessFile raf = new RandomAccessFile("src/ch16_IO/score2.dat", "r");
				int i = 4;
				while(true) {
					raf.seek(i); // .seek(0) 0(처음)의 위치로 포인터 위치 되돌리기
					sumkor += raf.readInt();
					sumeng += raf.readInt();
					summath += raf.readInt();
					i+=16;// int 저장시 4byte씩 움직여서..
				}
				
			}catch(EOFException eof) {
				System.out.println("국어 sum : "+sumkor);
				System.out.println("영어 sum : "+sumeng);
				System.out.println("수학 sum : "+summath);
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

}
