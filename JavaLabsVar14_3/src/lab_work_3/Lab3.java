package lab_work_3;


public class Lab3 {
	
	public static void main(String[] args) {
		VectorAct vectOper = new Operations();


		System.out.print("Enter vector B: ");
		Data.B = vectOper.vectInput();

		System.out.print("Enter vector D: ");
		Data.C = vectOper.vectInput();

		Thread tr3 = new Thread(new Proc3());
		

		try {
			tr3.start();
			tr3.join();
			
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted!");
		}

	}
}
