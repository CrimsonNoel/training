package ch16_IO;

import java.io.File;
import java.io.FilenameFilter;

public class File_Ex_03 {
	public static void main(String[] args) throws Exception{
			String currDir = System.getProperty("user.dir");
			File dir = new File(currDir);
			final String pattern = "c";
			// String[] list (FilenameFilter filter)
			String[] files = dir.list(new FilenameFilter(){
				public boolean accept(File dir, String name) {
					return name.indexOf(pattern) != -1;
				}
			});
			for(int i=0; i< files.length; i++) {
				System.out.println(files[i]);		}
			System.out.println("=================================");

			
			String[] files1 = dir.list((d,n)-> n.indexOf(pattern)!=-1);
			for(int i=0; i<files1.length; i++) {
				System.out.println(files[i]);
			}
			System.out.println("=================================");
			
			File[] files2 = dir.listFiles()	;
			for(File f : files2) {
				if(f.getName().indexOf(pattern)!=-1) {
					System.out.println(f.getName());
				}
			}
		
	}

}
