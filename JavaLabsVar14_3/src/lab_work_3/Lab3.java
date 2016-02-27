package lab_work_3;


public class Lab3 {
	
	public static void main(String[] args) {
		VectorAct vectOper = new Operations();
		Thread tr2 = new Thread(new Proc2());
		
		Data.monitor.waitForFreeInput();
		Data.monitor.holdInput(); // захоплення монітору введення

		System.out.print("Enter vector B: ");
		Data.B = vectOper.vectInput();

		System.out.print("Enter vector D: ");
		Data.C = vectOper.vectInput();
		
		Data.monitor.signalInputIsFree(); // звільнення монітору введення
		Data.monitor.signalVarInput(); // сигнал дозволу виконання арифм. операцій

		

		try {
			tr2.start();
			
			tr2.join();
			
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted!");
		}

	}
}
