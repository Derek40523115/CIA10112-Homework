package hw9;

class Depto{
	public static int stock = 0;
	public Depto() {
		
	}
	synchronized public void give(int money) {
		while(stock > 3000) {
			System.out.println("媽媽看到餘額在3000以上,暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			stock += money;
			System.out.println("媽媽存了" + money +"帳戶共有 : " + stock);
			notify();
	}
	
	synchronized public void consume(int money) {
		while(stock < money) {
			System.out.println("熊大看到帳戶沒錢,暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock -= money;
		System.out.println("熊大領了" + money + "帳戶共有 : " + stock);
		if(stock <= 2000) {
			System.out.println("熊大看到餘額在2000以下,要求匯款");
			notify();
		}
	}
}

class Consumer extends Thread{
	Depto depto;
	public Consumer(Depto depto) {
		this.depto = depto;
	}
	public void run() {
		for(int i = 0; i <= 10; i++) {
			depto.consume(1000);
		}
	}
}

class Giver extends Thread{
	Depto depto;
	public Giver(Depto depto) {
		this.depto = depto;
	}
	public void run() {
		for(int i = 0; i <= 10; i++) {
			depto.give(2000);
		}
	}
}

public class Homework_9_2 {
	public static void main(String[] args) {
		Depto depto = new Depto();
		Giver mom = new Giver(depto);
		Consumer son = new Consumer(depto);
		son.start();
		mom.start();
		
	}
}
