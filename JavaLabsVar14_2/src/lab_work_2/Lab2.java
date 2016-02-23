package lab_work_2;

public class Lab2 {

	public static void main(String[] args) throws InterruptedException {

		VectorAct vectOper = new Operations();

		try {
			Data.semInput.acquire(); // ��������� �������� ��������
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// �������� ������� B � D
		System.out.print("Enter vector B: ");
		Data.B = vectOper.vectInput();

		System.out.print("Enter vector D: ");
		Data.C = vectOper.vectInput();
		Data.semInput.release(); // ��������� �������� ��������

		Data.semWait.release(); // ����� ��������� �����. ��������

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
