package hw5;

public class Homework_5_2 {
	public Homework_5_2(){
		
	}
	private static void randAvg() {
		int sum = 0;
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			int random_number = (int)((Math.random()*100));
			array[i] = random_number;
			System.out.print(array[i] + " ");
		}
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println();
		System.out.println(sum / 10);
	}
	
	public static void main(String[] args) {
		randAvg();
	}

}
