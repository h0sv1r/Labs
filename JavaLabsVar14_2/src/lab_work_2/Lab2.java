package lab_work_2;

public class Lab2 {

	public static void main(String[] args) throws InterruptedException {

		VectorAct vectOper = new Operations();

		try {
			Data.semInput.acquire(); // захолення семафору введення
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Введення векторів B і D
		System.out.print("Enter vector B: ");
		Data.B = vectOper.vectInput();

		System.out.print("Enter vector D: ");
		Data.C = vectOper.vectInput();
		Data.semInput.release(); // звільнення семафору введення

		Data.semWait.release(); // дозвіл виконання арифм. операцій

		Thread tr2 = new Thread(new Proc2());
		Thread tr3 = new Thread(new Proc3());
		Thread tr4 = new Thread(new Proc4());

		try {
			tr2.start();
			tr3.start();
			tr4.start();
			tr2.join();
			tr3.join();
			tr4.join();
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted!");
		}
		
	}

}
