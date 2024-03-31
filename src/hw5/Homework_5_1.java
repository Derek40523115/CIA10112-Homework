package hw5;

import java.util.Scanner;

public class Homework_5_1 {
	public Homework_5_1() {
		
	}
	private void starSquare(int width, int height) {
		for(int column = 0; column < height; column++) {
			for(int row = 0; row < width; row++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("請輸入寬與高");
		Scanner s = new Scanner(System.in);
		int number_1 = s.nextInt();
		int number_2 = s.nextInt();
		Homework_5_1 h = new Homework_5_1();
		h.starSquare(number_1, number_2);
	}
}
