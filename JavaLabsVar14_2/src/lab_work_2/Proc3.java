package lab_work_2;

public class Proc3 implements Runnable {

	@Override
	public void run() {
		try {
			Data.semInput.acquire(); 
		} catch (InterruptedException e) {
			System.out.println("Semaphore interription in proc 3!");
		}

		MassAct massOper = new Operations();
		ScalAct scalOper = new Operations();
		Data.MZ = massOper.massInput();
		Data.semInput.release(); 
		Data.semWait.release(); 

		try {
			Data.semOutput.acquire(); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		scalOper.scalOutput();
	}

}
