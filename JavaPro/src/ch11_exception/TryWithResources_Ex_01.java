package ch11_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryWithResources_Ex_01 {
	// File("text.txt)정의 안하면 default값이 project(JavaPro)이다
	// Scanner 안에 Closeable? 자동으로 사용된다.편리?;
	// File("text.txt)자체가 한줄밖에 안읽는다. while을 통해 반복시키면 에러나는데
	// 그부분을 예외처리한것
	public static void main(String[] args) { 
		try(Scanner sc = new Scanner(new File("text.txt"))){
				while(true) {
			System.out.println(sc.nextLine());}
	}catch(FileNotFoundException e) {
//		e.printStackTrace();
		System.out.println("FileNotFoundException");
	}catch(NoSuchElementException e) {
//		e.printStackTrace();
//		System.out.println("NoSuchElementException");
		System.out.println("end-file");
	}

	}}
