package ch02_var;

public class Ex_Var_03 {

	public static void main(String[] args) {
		//3. 잘못된 문장을 고쳐서 에러가 발생하지 않도록 수정하시오.

		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128;
		var4 = var1;
		var1 =  (byte)var3;  
		float var5 = 1.0f;
		double var6 = 1.0;
		var5 = (float)var6;
		var6 = var5;
		
		}

	}


