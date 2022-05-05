package threads;

class VenueFixing extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("============VenueFixing==================");
	}
}

class WeddingCard extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("============WeddingCard printing==================");
	}
}

class CardDistribution extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("============Card Distribution==================");
	}
}

//class MyThreadDemo extends Thread{
//	
//	@Override
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Child thread  "+Thread.currentThread().getName());
//		}
//	}
//}

public class JoinThreadExample {

	public static void main(String[] args) {
//		MyThreadDemo t1 = new MyThreadDemo();
//		t1.start();
//		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main thread  "+Thread.currentThread().getName());
//		}
		
		System.out.println("Process started by "+Thread.currentThread().getName() + " Thread");
		
		VenueFixing t1 = new VenueFixing();
		WeddingCard t2 = new WeddingCard();
		CardDistribution t3 = new CardDistribution();
		
		t1.start();
		try {
			System.out.println(Thread.currentThread().getName());
			t1.join();
			t2.start();
			t2.join();
			t3.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
