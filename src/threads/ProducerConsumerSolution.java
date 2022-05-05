package threads;

import java.util.LinkedList;

public class ProducerConsumerSolution {
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 3;

	public void produce() throws InterruptedException {
		int value = 0;

		while (true) {
			synchronized (this) {
				if (list.size() == capacity) {
					System.out.println("=================list is full: waiting=========================="+list);
					wait();
				}

				System.out.println("Producer Producing " + value);
				list.add(value++);
				notify();
				Thread.sleep(1000);
			}

		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() == 0) {
					System.out.println("=================list is empty: waiting=========================="+list);
					wait();
				}

				int value = list.removeFirst();
				System.out.println("Consumer consuming " + value);
				notify();
				Thread.sleep(1000);
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ProducerConsumerSolution pc = new ProducerConsumerSolution();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

}
