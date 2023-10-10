package ch06_obj1;
/*
 * Rectangle 객체를 3개 저장할 배열을 생성하기
 * 0번지 : 가로 : 10, 세로 : 20
 * 1번지 : 가로 : 11, 세로 : 21
 * 2번지 : 가로 : 12, 세로 : 22
 * 인 객체를 생성하고,
 * 각각의 넓이와 둘레 출력하기
 */
public class Ex_Obj_02 {

	public static void main(String[] args) {
		// Rectangle 객체를 3개 저장할 배열
		// Rectangle 객체를 참조할 참조변수의 배열
		Rectangle[] rarr = new Rectangle[3];
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new Rectangle(10+i,20+i);
//			rarr[i].width = 10+i;
//			rarr[i].height = 20+i;
					
			System.out.print(i+"번 사각형 넓이:");
			rarr[i].area();  // 이미 만든 area,length를 이용 Ex_Obj_01에 있는 클래스사용;
			System.out.print(i+"번 사각형 둘레:");
			rarr[i].length();
		}}}
	


// rarr[i] = new Rectangle(10+i,20+i);
// 파라미터 값을 넣어줘서 오버로딩을 해줘야한다.
// 대신 오버로딩을 해주면 기본 생성자 new 생성자(){}가 없어지기 때문에(기본생성자만잇으면 생략해도 작동)
// 새로운 오버로딩 생성자 + 기본생성자 같이 생성해줘야한다.
// Ex_Obj_01 class를 불러왔고, 거기에 생성,변경했음.
	