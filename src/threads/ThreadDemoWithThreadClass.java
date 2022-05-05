package threads;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread  " + i + " " + Thread.currentThread().getName());
		}
	}

	public void run(int x) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread  " + i + " " + Thread.currentThread().getName());
		}
	}

	public void start() {
		super.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread  " + i + " " + Thread.currentThread().getName());
		}
	}
}

public class ThreadDemoWithThreadClass {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
//		t1.start(); // will throw run time exception
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread " + i);
		}
	}
}
