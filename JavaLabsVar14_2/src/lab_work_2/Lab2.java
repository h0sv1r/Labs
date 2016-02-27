package lab_work_2;

public class Lab2 {

	public static void main(String[] args) throws InterruptedException {

		VectorAct vectOper = new Operations();
		Thread tr2 = new Thread(new Proc2());

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

		
		

		try {
			tr2.start();
			
			tr2.join();
			
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted!");
		}
		
	}

}
