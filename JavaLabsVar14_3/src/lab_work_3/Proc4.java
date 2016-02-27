package lab_work_3;


public class Proc4 implements Runnable {

	@Override
	public void run() {
		Data.monitor.waitVarInput(); // Очікування двох сигналів дозволу для виконання арифм. операцій
		MassAct massOper = new Operations();
		VectorAct vectOper = (VectorAct) massOper;
		ScalAct scalOper = (ScalAct)vectOper;

		Data.a=scalOper.scalSum(vectOper.vectMul(Data.B,massOper.massVectMul(Data.MZ, Data.C)));
		
		Data.monitor.signalResult(); // сигнал дозволу виводу результату
	
	}

}



