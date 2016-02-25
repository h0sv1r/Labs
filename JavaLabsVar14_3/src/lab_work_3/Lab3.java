package lab_work_3;


public class Lab3 {
	
	public static void main(String[] args) {

		VectorAct vectOper = new Operations();

		// Введення векторів B і D
		System.out.print("Enter vector B: ");
		Data.B = vectOper.vectInput();

		System.out.print("Enter vector D: ");
		Data.C = vectOper.vectInput();

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
