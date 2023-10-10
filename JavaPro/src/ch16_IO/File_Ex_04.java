package ch16_IO;

import java.io.File;
import java.util.ArrayList;

public class File_Ex_04 {
		static int totalFiles = 0;
		static int totalDirs = 0;
	public static void main(String[] args) {
		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir + "\\src");
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효 하지않은 디렉토리 입니다"); System.exit(0);		}
		printFileList(dir);
		System.out.println(); System.out.println("총 "+ totalFiles+"개의 파일");
		System.out.println("총 "+ totalDirs + "개의 디렉토리"); }
	
	
	private static void printFileList(File dir) {
		System.out.println(dir.getAbsolutePath()+"  디렉토리");
		File[] files = dir.listFiles();
		ArrayList<Integer> subDir = new ArrayList<Integer>();
		for(int i=0; i<files.length;i++) {
			String filename = files[i].getName();
			if(files[i].isDirectory()) {
				filename = "["+filename+"]";
				subDir.add(i);		}
			System.out.println(filename);		}
		totalDirs += subDir.size();		totalFiles +=(files.length - subDir.size());
		System.out.println((files.length - subDir.size())+"개의 파일"+subDir.size()+"개의 디렉토리");
		for(int i=0; i<subDir.size(); i++) {
			printFileList(files[subDir.get(i)]);
		}
	}
	
	
		
		
		
	}


