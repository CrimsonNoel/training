package ch16_IO;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_Ex_02 {

	public static void main(String[] args) {
						
			int[] score = { 1, 100,  90,  90,
						    2, 	70,  90, 100,
						    3, 100, 100, 100,
						    4,  70,  60,  80,
						    5, 	70,  90, 100			};
			
			try {
				RandomAccessFile raf = new RandomAccessFile("src/ch16_IO/score2.dat","rw");
				for(int i=0; i<score.length; i++) {
					raf.writeInt(score[i]);
				}
				raf.seek(0);
				while(true) {
					for(int i=0; i<score.length; i++) {
						for(int j=0; j<4;j++) {
							System.out.print(raf.readInt()+",\t");
						}System.out.println();
					}
					
				}
				
			
			}catch(EOFException eof) {
				// readInt() 을 호출 하였을 때 더 이상 읽을 내용이 없으면 EOFEception이 발생한다.
			}catch(IOException e) {
				e.printStackTrace();
			}
	
	}

}
