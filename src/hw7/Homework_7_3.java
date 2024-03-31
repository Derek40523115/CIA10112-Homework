package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Homework_7_3{
	
	public static void copeFile(String s1, String s2) throws Exception{
		File myFile = new File(s1);
		
		FileInputStream fis = new FileInputStream(myFile);
		FileOutputStream out = new FileOutputStream(s2);
		
		int c;
		while ((c = fis.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c);
			System.out.flush();
		}
		
		out.close();
		fis.close();
	}
	
	public static void main(String[] args) throws Exception{
		copeFile("c:\\javawork\\Data.txt", "c:\\javawork\\Data_2.txt");
	}
	
}

