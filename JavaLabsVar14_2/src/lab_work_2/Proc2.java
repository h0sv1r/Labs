package lab_work_2;


public class Proc2 implements Runnable {

	@Override
	public void run() {
		Thread tr3 = new Thread(new Proc3());
		Thread tr4 = new Thread(new Proc4());
		
		tr3.start();
		tr4.start();
	}

}
