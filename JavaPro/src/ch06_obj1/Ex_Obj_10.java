package ch06_obj1;
/*
 * 1) Student class 만들기
 * 	  변수 : name, oracle, java, total (oracle + java)
 *    메소드 : toString()
 *    생성자 : String(name, oracle, java)
 * 2) Student[] sts 배열 만들어 저장하기
 * 3) total 순 sort descending 하기
 */


public class Ex_Obj_10{

	public static void main(String[] args) {
		String[] names = {"홍길동","김자바","나몰라","졸려요"};
		int[] oracles = {100, 85, 70, 90};
		int[] javas = {100, 70, 75, 90};
		Student1[] sts = new Student1[names.length];
		for(int i =0; i<sts.length; i++) {
			sts[i] = new Student1(names[i], oracles[i], javas[i]);
		}
		for(Student1 s:sts) { System.out.println(s);
		}
		System.out.println("==============sort decending 후=======================");
		for(int i=0; i<sts.length;i++) {
			for(int j=0;j<sts.length-1;j++ ) {
				if(sts[j].total<sts[j+1].total) {
					Student1 temp;
					temp = sts[j];
					sts[j]=sts[j+1];
					sts[j+1]=temp;
			}}}
			for(Student1 s: sts) {		System.out.println(s);	}
	}
	}

class Student1{
	String name;
	int oracle, java, total;
	
	public Student1(String name, int oracle, int java) {
		super();
		this.name = name;
		this.oracle = oracle;
		this.java = java;
		this.total = oracle+java;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", oracle=" + oracle + ", java=" + java + ", total=" + total + "]";
	}	
}