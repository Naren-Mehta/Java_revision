package threads;

class MyThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread  " + Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

public class YieldExample {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread  " + Thread.currentThread().getName());
		}
	}

}
