package ch12_API;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormat_Ex_01 {

	public static void main(String[] args) {

		DecimalFormat df1 = new DecimalFormat("###,###.##"); 
		DecimalFormat df2 = new DecimalFormat("000,000");
		
		Number num;
		try {
			num = df1.parse("1,234.56");
		
		// String ---> Number
		double d = num.doubleValue();
		System.out.println(d+"->"+ df1.format(num));
		// Number --> String
		System.out.println(d+"->"+ df2.format(num));
		// Number --> String
		} catch (ParseException e) {
			e.printStackTrace();
	}
	}

}
