package threads;

class TestThread extends Thread{
	
	public static Thread mt;
	@Override
	public void run() {
		try {
			mt.join();// This will wait for main thread to finish
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread  "+Thread.currentThread().getName());
		}
	}
}

public class JoinThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		// Main thread should execute first then child threads
		//This is Dead Lock
		
		TestThread t1 = new TestThread();
		t1.mt = Thread.currentThread();
		t1.start();
		t1.join(); // This will wait to finish Thread T1
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
