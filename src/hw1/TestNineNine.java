package hw1;

public class TestNineNine {
	public static void main(String[] args) {
		
		for(int a = 1; a <= 9; a++) {
			int b = 1;
			while(b <= 9) {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			}
			System.out.println();
		}
		
//		for(int a = 1; a <= 9; a++) {
//			int b = 1;
//			do {
//				System.out.print(a + "*" + b + "=" + a * b + "\t");
//				b++;
//			}while(b <= 9);
//			System.out.println();
//		}
		
//		int a = 1;
//		while(a <= 9) {
//			int b = 1;
//			do {
//				System.out.print(a + "*" + b + "=" + a * b + "\t");
//				b++;
//			}while(b <= 9);
//			System.out.println();
//			a++;
//		}
	}
}
