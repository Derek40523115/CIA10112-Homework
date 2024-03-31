package hw9;

public class Homework_1 implements Runnable{
	String name;
	int bowl = 1;
	public Homework_1(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		while(bowl <= 10) {
			System.out.println(name + "吃第" + bowl + "碗飯");
			bowl++;
			
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		System.out.println(name + "吃完了");
	}
	public static void main(String[] args) {
		Homework_1 human_1 = new Homework_1("饅頭人");
		Thread t1 = new Thread(human_1);
		Homework_1 human_2 = new Homework_1("詹姆士");
		Thread t2 = new Thread(human_2);
		t1.start();
		t2.start();
	}
}
