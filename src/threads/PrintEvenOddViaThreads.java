package threads;

public class PrintEvenOddViaThreads {
	int counter = 1;

	static int num;

	public void printEvenNumbers() {

		synchronized (this) {
			while (counter < num) {
				System.out.println("==even counter="+Thread.currentThread().getName());

				if (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter + " ");
				counter++;
				notify();
			}
		}

	}

	public void printOddNumbers() {
		synchronized (this) {
			while (counter < num) {
				System.out.println("==odd counter="+Thread.currentThread().getName());

				if (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter + " ");
				counter++;
				notify();
			}
		}

	}

	public static void main(String[] args) {

		PrintEvenOddViaThreads mt = new PrintEvenOddViaThreads();
		num = 10;
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				mt.printEvenNumbers();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				mt.printOddNumbers();
			}
		});

		t1.start();
		t2.start();

	}

}
