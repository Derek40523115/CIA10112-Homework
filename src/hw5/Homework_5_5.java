package hw5;

public class Homework_5_5 {

	public static void genAuthCode() {
		int count = 0;
		while(count < 9) {
			int number_random = (int)(Math.random() * 75 + 48);
			if(number_random >= 48 && number_random <= 57 || number_random >= 65 && number_random <= 90 || number_random >= 97 && number_random <= 122) {
				System.out.print((char)number_random);
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		genAuthCode();
	}
}
