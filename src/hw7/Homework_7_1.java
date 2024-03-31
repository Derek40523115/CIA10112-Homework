package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework_7_1 {
	public static void main(String[] args) {
		File myFile = new File("C:\\CIA101_Workspace\\CIA10112-Homework\\Sample.txt");
		
		Long byteCount = myFile.length();
//		System.out.println(byteCount);
		try {
			FileReader fr = new FileReader("Sample.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			int row = 0;
			int charCount = 0;
			
			while ((str = br.readLine()) != null) { //readLine會直接讀一段文字直到換行符號且轉為字串
//                System.out.println(str);
                charCount += str.length();
                row++;
				}
			
			System.out.println("位元組 = " + byteCount + "\t字元 = " + charCount + "\t列 = " + row);
			
			br.close();
			fr.close();
		}catch(IOException e) {
			System.err.println(e);
		}
	}
}
