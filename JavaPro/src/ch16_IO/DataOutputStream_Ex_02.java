package ch16_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_Ex_02 {

	public static void main(String[] args) {
		int[] score= {100, 90, 95, 85, 50};
		String fileName = "src/ch16_IO/score.dat";
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			DataOutputStream dos = new DataOutputStream(fos);
	
			for(int i=0; i<score.length;i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		}catch(IOException e) {
			
		}
			
	
	}


}
