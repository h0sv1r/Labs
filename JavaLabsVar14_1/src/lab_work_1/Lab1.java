package lab_work_1;


public class Lab1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread tr1 = new Thread(new Thr1(), "Thread 1");
		Thread tr2 = new Thread(new Thr2(), "Thread 2");
		Thread tr3 = new Thread(new Thr3(), "Thread 3");
		try {
			tr1.start();
			tr2.start();
			tr3.start();
			tr1.join();
			tr2.join();
			tr3.join();
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted!");
		}
		

	}

}
