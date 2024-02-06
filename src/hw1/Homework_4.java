package hw1;

import java.util.Scanner;

public class Homework_4 {
	public static void main(String[] args) {
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
//		int sum = 0;
//		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		for (int b = 0; b < a.length; b++) {
//			if (a[b] > sum/a.length) {
//				System.out.print(a[b] + "\t");
//			}
//		}
//		System.out.println();
//		System.out.println(sum / a.length);
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
//		String s = "Hello World";
//		for(int i = s.length() - 1; i >= 0; i--) {
//			System.out.print(s.charAt(i));
//		}
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
//		String s []= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		String t = "aeiou";
//		int sum = 0;
//		for(int i = 0; i < s.length; i++) {
//			for(int b = 0; b < s[i].length(); b++) {
//				char a = s[i].charAt(b);
//				for(int c = 0; c < t.length();c++) {
//					if(a == t.charAt(c)){
//						sum += 1;
//					}
//				}
//			}
//		}
//		System.out.println(sum);
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		int[][] intarray = {{25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200}};
//		System.out.print("請輸入借錢數: ");
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		System.out.print("有錢可借的員工編號:");
//		for(int i = 0; i < intarray[1].length;i++) {
//			int a = intarray[1][i];
//			if(a >= n) {
//				System.out.print(intarray[0][i] + " ");
//			}
//		}
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//		Scanner s = new Scanner(System.in);
//		int y = s.nextInt();
//		int m = s.nextInt();
//		int d = s.nextInt();
//		int sum = 0;
//		double a = 365 / 12;
//		double b = 366 / 12;
//		int[] s1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		if(y%4 == 0 && m > 2) {
//			for(int i = 0; i < m - 1; i++) {
//				sum += s1[i];
//			}
//			System.out.println(sum + d + 1); 
//		}else {
//			for(int i = 0; i < m - 1; i++) {
//				sum += s1[i];
//			}
//			System.out.println(sum + d); 
//		}
//		請算出每位同學考最高分的次數
//		int[][] a = {{10, 35, 40, 100, 	90, 85, 75, 70},
//					{37, 75, 77, 89, 64, 75, 70, 95},
//					{100, 70, 79, 90, 75, 70, 79, 90},
//					{77, 95, 70, 89, 60, 75, 85, 89},
//					{98, 70, 89, 90, 75, 90, 89, 90},
//					{90, 80, 100, 75, 50, 20, 99, 75}
//		};
//		int[] testmaxscore = new int[8];
//		for(int i = 0; i < a.length; i++) {
//			int max = a[i][0];
//			for(int j : a[i]) {
//				if(j > max) {
//					max = j;
//				}
//			}
//			testmaxscore[i] = max;
//		}
//		int[] studentmaxscore = new int[8];
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a[i].length; j++) {
//				if(a[i][j] == testmaxscore[i]) {
//					studentmaxscore[j]++;
//				}
//			}
//		}
//		for(int i = 0; i < testmaxscore.length; i++) {
//			System.out.println(i + 1 + "號學生    " + "最高分次數=" + studentmaxscore[i]);
//		}
	}
}
