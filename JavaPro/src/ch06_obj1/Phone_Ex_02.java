package ch06_obj1;

public class Phone_Ex_02 {

	public static void main(String[] args) {
		Phone[] parr = new Phone[3];
		for(int i=0; i<parr.length; i++) {
			Phone p =new Phone();
			parr[i] = p;
			parr[i].no = i+"-1234";
			//no : 0: 0-1234, 1: 1-1234, 2: 2-1234
		}
		for(int  i=0; i<parr.length;i++) {
			System.out.printf("parr[%d].no=%s\n",i,parr[i].no);
			parr[i].send(
					(i==0)?parr[parr.length-1].no:parr[i-1].no
					// i == 0;  parr[2].no 0행에서 -1행만큼 더하면 2행이 나온다.
					// i = 1;   parr[0].no
					// i = 2;   parr[1].no		
					);
		}
		
	}

}
