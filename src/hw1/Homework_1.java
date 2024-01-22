package hw1;

public class Homework_1 {
	public static void main(String[] args) {
		//• 請設計一隻Java程式，計算12，6這兩個數值的和與積
//		System.out.println("12 x 6 = " + 12 * 6);
//		System.out.println("12 + 6 = " + (12 + 6));
		
//		//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
//		System.out.println("200 / 12 = " + 200/12 + "..." + 200%12);
		
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//		int second = 256559;
//		int minute = 60;
//		int hour = minute * 60;
//		int day = hour * 24;
//		
//		System.out.println("天數 = " + second/day);
//		second = second % day;
//		System.out.println("小時 = " + second /hour);
//		second = second % hour;
//		System.out.println("分鐘 = " + second / minute);
//		second = second % minute;
//		System.out.println("秒 = " + second);
		
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//		final double pi = 3.1415;
//		int r = 5;
//		double area = r*r*pi;
//		double circumference = 2*r*pi;
//		System.out.printf("圓面積 = %.2f%n", area);//顯示到小數點第二位，%n是換行
//		System.out.printf("圓周長 = %.2f%n", circumference);//顯示到小數點第二位，%n是換行
		
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
//		int money = 150;
//		double rate = 0.02;
//		double a = 150*Math.pow(1 + rate, 10);
//		System.out.printf("共有 =  %.2f萬%n", a);
		
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
		System.out.println(5 + 5);//數字相加
//		5 + ‘5’
		System.out.println(5 + '5');
//		5 + “5”
		System.out.println(5 + "5");//為串接相加
	}
}
