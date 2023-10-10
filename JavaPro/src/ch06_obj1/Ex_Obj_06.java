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
public class Ex_Obj_06 {
	public static void main(String[] args) {
		Rectangle31[] recarr = new Rectangle31[3];
		recarr[0] = new Rectangle31(10,10);
		recarr[1] = new Rectangle31(20,10);
		recarr[2] = new Rectangle31(25,25);
		for (Rectangle31 r: recarr) { r.info();}
	}}

class Rectangle31 {
	int width,height,serialNo;
	static int sno;
	Rectangle31(){}
	Rectangle31(int a, int b){
		this.width = a;
		this.height = b;
		serialNo = ++sno;
	}
	void info() {
		System.out.println(serialNo+"번 사각형 : "+"("+width+","+height+") 넓이: "+
							area1()+", 둘레: "+((isSquare1()==true)?"정사각형":"직사각형"));
	}
int area1() {
	return width*height;
}
int length1() {
	return 2*(width+height);
}
boolean isSquare1() {
	return (width==height);
}
}