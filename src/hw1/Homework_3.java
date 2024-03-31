package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入三個整數 : ");
		int[] triangle = new int[3];
		for(int i = 0; i < 3; i++) {
			triangle[i] = s.nextInt();
		}
		Arrays.sort(triangle);
		if(!(triangle[0] + triangle[1] > triangle[2])) {
			System.out.println("不是三角形");
		}
		else if(triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
			System.out.println("正三角形");
		}
		else if(triangle[0] == triangle[1] || triangle[0] == triangle[2] || triangle[1] == triangle[2]) {
			System.out.println("等腰三角形");
		}
		else if(Math.pow(triangle[0], 2) + Math.pow(triangle[1], 2) == Math.pow(triangle[2], 2)) {
			System.out.println("直角三角形");
		}
		else if(triangle[0] + triangle[1] > triangle[2]) {
			System.out.println("其他三角形");
		}
		s.close();
	}

}
