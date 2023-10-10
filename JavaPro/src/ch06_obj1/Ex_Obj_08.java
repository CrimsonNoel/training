package ch06_obj1;
/*
 * 정육면체 a의 부피(volume): 27, 겉넓이(surfaceArea): 54 
 * 정육면체 b의 부피: 125, 겉넓이: 150
 * 변수 : length 
 */

public class Ex_Obj_08 {

	public static void main(String[] args) {
		 // 두 정육면체 객체 생성
	    Cube a = new Cube(3);
	    Cube b = new Cube(5);
	    
	    
	    // 두 정육면체의 부피와 겉넓이 출력
	    System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n",
	    		a.volume(), a.surfaceArea());
	    System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", 
	    		b.volume(), b.surfaceArea());

	}}

class Cube{
	int length;
	
	Cube(int length){
		this.length = length;
	}

	int volume() {
		return length*length*length;
	}
	int surfaceArea() {
		return 6*length*length;
	}
		
}


