package lab_work_2;


public class Proc4 implements Runnable {

	@Override
	public void run() {
		MassAct massOper = new Operations();
		VectorAct vectOper = (VectorAct) massOper;
		ScalAct scalOper = (ScalAct)vectOper;
		try {
			Data.semWait.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Data.a=scalOper.scalSum(vectOper.vectMul(Data.B,massOper.massVectMul(Data.MZ, Data.C)));
		Data.semOutput.release();
	
	}

}



//a =  (B* (C * MZ) )