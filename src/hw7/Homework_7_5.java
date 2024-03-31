package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Homework_7_5 {
	public static void main(String[] args) throws Exception{
		
		try {
		FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		
			while (true) {
				Object obj = ois.readObject();
				
				if (obj instanceof Cat) {
					((Cat) obj).speak();
				}else if(obj instanceof Dog) {
					((Dog) obj).speak();
				}
				
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}

		
	}
}
