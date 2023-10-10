package ch14_collection;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 생성자 :  Student3(stuno,name,kor,math,eng)
public class Ex_Collection_04 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new File("src/ch14_collection/student.txt"));
		List<Student3> li = new ArrayList<Student3>();
		while(scan.hasNextLine()) {
//			System.out.println(scan.nextLine());
			String line = scan.nextLine();
			String[] str = line.split(",");
			// .txt 파일 긁어와서 읽는부분
			// Sting,String,int,int,int 배열이기에 Integer.ParseInt(String)으로 변환해준다
			Student3 st = new Student3(str[0], str[1], 
					Integer.parseInt(str[2]), 
					Integer.parseInt(str[3]), 
					Integer.parseInt(str[4]));
					li.add(st); 
			System.out.println(st);
		}
		System.out.println("1. 학번 역순 프린트(Comparable)");
		Collections.sort(li);
		printList(li);
		
		System.out.println("2. 이름순 프린트(Comparator)");
		
		Collections.sort(li,new Comparator<Student3>() {
			
			@Override
			public int compare(Student3 o1, Student3 o2) {
				
				return o1.name.compareTo(o2.name);
			}
		});
		printList(li);
		
		System.out.println("3. 총점순 프린트(Comparator)");
		Collections.sort(li,new Comparator<Student3>() {

			@Override
			public int compare(Student3 o1, Student3 o2) {
				return o1.total - o2.total;
			}
		});
		printList(li);
		
		
			}

	public static void printList(List<Student3> li) {
		for(Object pl : li) {
			System.out.println(pl);
		} //  리스트 잘 읽어놓고 프린트까지 잘해놧지만 리스트에 추가(li.add(st)) 이걸 안해서 못읽었네\
}

	

}

class Student3 implements Comparable<Student3>{
	String stuno,name;
	int kor,math,eng,total;
	public Student3(String stuno, String name, int kor, int math, int eng) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		total = (kor+math+eng);
	}
	@Override
	public String toString() {
		return "Student3 [stuno= " + stuno + ", "
				+"name=" + name + " kor=" + kor + ", math=" + math + ", eng=" + eng +
				" total "+total+"]";
	}
	@Override
	public int compareTo(Student3 o) {
		
		return stuno.compareTo(o.stuno)*-1;
	}}
class DescName implements Comparator<Student3>{

	@Override
	public int compare(Student3 o1, Student3 o2) {
		
		return Integer.parseInt(o2.name)-Integer.parseInt(o1.name);
	}
	
}