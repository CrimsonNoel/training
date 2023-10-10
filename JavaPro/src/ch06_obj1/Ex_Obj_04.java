package ch06_obj1;
/*
 * Rectangle2 클래스를 정의하기
 * 		멤버변수 : width, height, seralNo(사각형번호), sno(번호 생성하기 위한 변수)
 * 		멤버메서드 : 
 * 			int area() : 면적을 구하기
 * 			int length() : 둘레를 구하기
 * 			public String toString() 메서드 구현하기
 * 	 구동 클래스 구현
 * 		Rectangle2 클래스를 3개 가지고 있는 배열 생성하기
 *    1번사각형 : 가로(10),세로(20)       
 *    2번사각형 : 가로(15),세로(25)
 *    3번사각형 : 가로(20),세로(30)     
 *    각각 사각형의 면적, 둘레 출력하고, 전체 면적의합과 둘레의 합출력하기    
 */
/* 출력
1번사각형 : (10,20) => 면적:200,  둘레:60
2번사각형 : (15,25) => 면적:375,  둘레:80
3번사각형 : (20,30) => 면적:600,  둘레:100
전체 사각형 면적의합 : 1175
전체 사각형 둘레의합 : 240
*/
public class Ex_Obj_04 {

	public static void main(String[] args) {
		int totalArea=0;
		int totalLength=0;
		
		Rectangle2[] rarr = new Rectangle2[3];
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new Rectangle2(10+i*5,20+i*5);
			System.out.println(rarr[i].serialNo+"번 사각형 넓이:"+rarr[i].area());
			totalArea+=rarr[i].area();  
			System.out.println(rarr[i].serialNo+"번 사각형 둘레:"+rarr[i].length());
			totalLength+=rarr[i].length();
			}
					
		
		System.out.println("전체 사각형의 면적의 합 : "+totalArea);
		
		System.out.println("전체 사각형의 둘레의 합 : "+totalLength);
		}}
	
class Rectangle2 {
	int width;
	int height;
	int serialNo;
	static int sno; // rarr[i].serialNo 진행으로 출력시 int sno는 변수가 계속 초기화되서 1번으로만 출력된다
	// static을 붙여줘서 초기화되지 않고 지속 사용되도록함
	int area() {
//		System.out.println(width+"*"+height+"="+(width*height));
		return width*height;}
	int length() {
//		System.out.println("("+width+"+"+height+")*2"+"="+(width+height)*2);	
		return(width+height)*2;}
	
	public Rectangle2() {}
	
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
		this.serialNo = ++sno;
	}
	}
