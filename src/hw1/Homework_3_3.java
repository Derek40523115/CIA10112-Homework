package hw1;

import java.util.Scanner;

public class Homework_3_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字");
		int number = s.nextInt();
		int sum = 0;
		for(int i = 1; i <= 49; i++) {
			if(i == number || i % 10 == number || i / 10 == number) {
				continue;
			}
			sum++;
			System.out.print(i + " ");
		}
		System.out.println("總共有" + sum + "數字可選");
		
	}
	
}
