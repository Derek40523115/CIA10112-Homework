package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Homework_7_4 {
	public static void main(String[] args) throws Exception{
		File Folder = new File("C:\\data");
		if(!Folder.exists()) {
			Folder.mkdir();
		}
		
		File file = new File("C:\\data\\Object.ser");
		Object[] obj = new Object[4];
		obj[0] = new Cat("Kitty");
		obj[1] = new Cat("noise");
		obj[2] = new Dog("womwom");
		obj[3] = new Dog("dog_2");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < obj.length; i++)
			oos.writeObject(obj[i]);
		
		oos.close();
		fos.close();
		
	}
}
