package ch12_API;
public class Class_Ex_01 {
	public static void main(String[] args) {
			Student s1 = new Student();
			s1.num = 99;
			s1.name = "김자바";
			System.out.println("s1: "+s1);
			Student s2;
			Class<?>c;
				try {
					c= Class.forName("ch12_API.Student");
					s2 = (Student)c.newInstance();
					s2.num = 10;
					s2.name = "잘몰라";
					System.out.println("s2: "+s2);
					System.out.println("s2==s1: "+(s2==s1));
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}catch(InstantiationException | IllegalAccessException e) {
					e.printStackTrace();
				}
		
		
	}}
class Student{
	int num;
	String name;
	
	@Override
	public String toString() {
		return num+ " : " +name;
	}}
