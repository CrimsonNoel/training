package ch14_collection;

public class Generic_Ex_01 {

	public static void main(String[] args) {
			Gclass<String> g1 = new Gclass<>();
			g1.setT("aaa");
			System.out.println(g1.t);
			Gclass<Integer> g2 = new Gclass<>();
			g2.setT(300);
			System.out.println(g2.t);
			
			Tclass t = new Tclass();
//			 Tclass<String>	t = new Tclass<String>(); 	//error
			
			
	}}

class Gclass<T>{
	T t;
	void setT(T t) {
		this.t=t;
	}}
class T{}

class Tclass{}