package lab_work_3;

public class Proc3 implements Runnable {

	@Override
	public void run() {

		MassAct massOper = new Operations();
		Data.MZ = massOper.massInput();


		// ��������� ����������
		System.out.print("a = " + Data.a);

	}

}
