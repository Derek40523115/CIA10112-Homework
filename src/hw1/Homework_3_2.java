package hw1;

import java.util.Scanner;

public class Homework_3_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int number = s.nextInt();
		int random_number = (int)(Math.random()*100);
//		System.out.println(random_number);
		while(number != random_number) {
			System.out.println("猜錯了");
			if(number > random_number) {
				System.out.println("大於正確答案");
			}else {
				System.out.println("小於正確答案");
			}
			number = s.nextInt();
		}
		System.out.println("猜對了");
		s.close();
	}
}
