package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Homework_7_2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("c:\\javawork\\Data.txt", true);
			
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			PrintStream ps = new PrintStream(bos);
			
			ps.println((int)(Math.random() * 1000 + 1));
			
			ps.close();
			bos.close();
			fos.close();
		}
		catch(IOException e) {
			System.err.println(e);
		}
	}
}
