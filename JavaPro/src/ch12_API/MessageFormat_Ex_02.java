package ch12_API;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormat_Ex_02 {
	public static void main(String[] args) throws Exception{
		String tableName = "studentscore";
		String fileName = "src/ch12_API/score.txt";
		
		String msg = "INSERT INTO"+tableName+ "VALUES(''{0}'',{1},{2},{3});";
					// 프린트시에는 ' ' 을 입력하여야 한다.
					// ''{0}'' = 'name' | '{0}' = {0} | {0} = name;
		Scanner s = new Scanner(new File(fileName));
		String pattern = "{0},{1},{2},{3},{4}";
		MessageFormat mf = new MessageFormat(pattern);
		while(s.hasNextLine()) {
			String line = s.nextLine();
			Object[] objs = mf.parse(line);		// 각각의 mapping 자료를 배열로만듬
		  System.out.println(MessageFormat.format(msg, objs));
		  		  }
		s.close();	
	} 

}
