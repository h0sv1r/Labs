package lab_work_2;

public class Proc3 implements Runnable {

	@Override
	public void run() {
		try {
			Data.semInput.acquire(); // захолення семафору введення
		} catch (InterruptedException e) {
			System.out.println("Semaphore interription in proc 3!");
		}

		MassAct massOper = new Operations();
		Data.MZ = massOper.massInput();
		Data.semInput.release(); // звільнення семафору введення
		Data.semWait.release(); // дозвіл виконання арифм. операцій

		try {
			Data.semOutput.acquire(); // Очікування дозволу виведення результату
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// виведення результату
		System.out.print("a = " + Data.a);

	}

}
