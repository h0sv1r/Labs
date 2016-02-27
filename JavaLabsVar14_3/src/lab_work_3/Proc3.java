package lab_work_3;


public class Proc3 implements Runnable {

	@Override
	public void run() {
		
		Data.monitor.waitForFreeInput();
		Data.monitor.holdInput(); // захолення монітору введення
		
		MassAct massOper = new Operations();
		Data.MZ = massOper.massInput();
		
		Data.monitor.signalInputIsFree(); // звільнення монітору введення
		Data.monitor.signalVarInput(); // сигнал дозволу виконання арифм. операцій
		Data.monitor.waitResult(); // очікування сигналу виведення результату


		System.out.print("a = " + Data.a);

	}

}
