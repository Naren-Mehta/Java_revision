package threads;

class ThreadA extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("===child thread starts===============" + Thread.currentThread().getName());
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}

			System.out.println("===child thread trying to give notificatioin===");
			this.notify();
		}
	}
}

public class WaitNotifyThreadExample {

	public static void main(String[] args) throws InterruptedException {
		ThreadA t1 = new ThreadA();
		t1.start();
		synchronized (t1) {
			System.out.println("==Main thread trying to call wait()==");
			t1.wait();
			System.out.println("Main thread got notified");
			System.out.println(t1.total);
		}
	}

}
