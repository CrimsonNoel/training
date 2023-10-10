package temp;

public class Modifier2 {
		//상속클래스도 안되는 변수의 접근제어자
		private int v1 = 10;
		int v2 = 20; //(default)
		
		// 상속클래스는 가능 - Modifier3
		protected int v3 = 30; // protected지만 상속받았기에 변수를 쓸수있다.
		public int v4 =40;
		
		@Override
		public String toString() {
			return v1+","+v2+","+v3+","+v4;
		}
	

}
