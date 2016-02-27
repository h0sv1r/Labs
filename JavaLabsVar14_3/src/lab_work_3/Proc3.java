package lab_work_3;

public class Proc3 implements Runnable {

	@Override
	public void run() {

		MassAct massOper = new Operations();
		Data.MZ = massOper.massInput();
		
		Thread tr4 = new Thread(new Proc4());
		tr4.start();
		
		try {
			tr4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print("a = " + Data.a);

	}

}
