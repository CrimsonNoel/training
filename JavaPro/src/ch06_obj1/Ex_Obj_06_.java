package ch06_obj1;
/*
 * Rectangle3 클래스 구현하기
 *  멤버변수 : width,height, serialNo, sno(사각형의번호를 생성 )
 *  생성자 : 가로와 세로를 입력받고, 가로,세로 값을 초기화함.
 *  멤버메서드 : 
 *      int area() : 넓이 값 리턴
 *      int length() : 둘레 값 리턴
 *      boolean isSquare() : 정사각형 여부 리턴
 *      void info() : 
 *          "1번사각형 :(10,10) 넓이:100, 둘레:40, 정사각형" 문자열을 출력하기
 *          "2번사각형 :(20,10) 넓이:200, 둘레:60, 직사각형" 문자열을 출력하기
 *         
 */
/*
 * 출력
 * 1번사각형 : (10,10) 넓이:100, 둘레:40 정사각형
   2번사각형 : (20,10) 넓이:200, 둘레:60 직사각형
   3번사각형 : (25,25) 넓이:625, 둘레:100 정사각형

 */
public class Ex_Obj_06_ {
	public static void main(String[] args) {
		Rectangle3[] recarr = new Rectangle3[3];
		recarr[0] = new Rectangle3(10,10);
		recarr[1] = new Rectangle3(20,10);
		recarr[2] = new Rectangle3(25,25);
		for (Rectangle3 r: recarr) { r.info();}
	}}

class Rectangle3{
	int width;
	int height;
	int serialNo;
	static int sno;
	
	public Rectangle3() {}
	
	public Rectangle3(int width, int height) {
		this.width = width;
		this.height = height;
		this.serialNo = ++sno;
	}
	//"1번사각형 :(10,10) 넓이:100, 둘레:40, 정사각형" 문자열을 출력하기
	void info() {
		System.out.println(serialNo+"번 사각형 : ("+width+","+height+")"+" 넓이 : "+area()
				+" 둘레 : "+length()+"  "+(isSquare()?"정사각형":"직사각형"));
	}
	//넓이 값 리턴
	int area() {
		return width*height;
	} 
	//둘레 값 리턴
	int length() {
		return(width+height)*2;
	}
	boolean isSquare() {
		return (width==height);
	}
}
