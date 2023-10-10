package ch15_lambda;

import java.util.function.Function;

/*
 * Function 계열 함수 인터페이스 : applyXXX 추상메서드를 멤버로 가진다.
 * 매개변수도 있고, 리턴값도 존재.
 * 주로 매개값을 리턴값으로 맵핑(타입 변환) 할 경우 사용
 * Function<Parameter, Return> | 매개변수 : Parameter, 리턴타입 : return
 */
public class Lambda_Ex_08 {
	private static Student[] list=
		{new Student("홍길동", 90, 80, "경영"),new Student("김삿갓", 95, 70, "컴공")	};
	
	public static void main(String[] args) {
			System.out.print("학생 이름:");
			printString(t->t.getName()); // return 타입 String
			System.out.print("전공 이름:");
			printString(t->t.getMajor());// String
			System.out.print("영어 점수:");
			printString(t->t.getEng()+""); // getEng = int +""붙여줘서 Stringㅇ로 변환.
			System.out.print("수악 점수:");
			printString(t->t.getMath()+""); // 마찬가지로 int +"" 붙여준다.
			
			System.out.print("영어 점수 합계:");
			printTotal(t->t.getEng());
			System.out.print("수학 점수 합계:");
			printTotal(t->t.getMath());
			
			System.out.print("영어 점수 합계:");
			printAver(t->t.getEng());
			System.out.print("수학 점수 합계:");
			printAver(t->t.getMath());
			
	}
			
						// 	 Function<Parameter, Return>
	private static void printString(Function<Student, String> f) {
			for(Student s : list) {
				System.out.print(" "+f.apply(s));
			}
			System.out.println();
	}
	private static void printTotal(Function<Student, Integer> f) {
		int sum =0;
		for(Student s : list) {
			sum += f.apply(s);
		}
		System.out.println(sum);
	}
	private static void printAver(Function<Student, Integer> f) {
		int avr = 0;
		for (Student s : list) {
			avr += f.apply(s);
		}
		System.out.println((double)avr/list.length);
	}
	

}

class Student{
	private String name;
	private int eng,math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		super();
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	// getter and setter 쓰면 편함
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [" + (name != null ? "name=" + name + ", " : "") + "eng=" + eng + ", math=" + math + ", "
				+ (major != null ? "major=" + major : "") + "]";
	}
	
}