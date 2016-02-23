package lab_work_1;

import java.util.ArrayList;

public class Thr1 implements Runnable {
	private ArrayList<Integer> A = new ArrayList<>();
	private ArrayList<Integer> B = new ArrayList<>();
	private ArrayList<Integer> C = new ArrayList<>();
	private ArrayList<Integer> D = new ArrayList<>();

	@Override
	public void run() {
		System.out.println("Thread 1 started!");
		VectorAct oper = new Operations();
		// заповнити вектори даними
		oper.vectFillUp(A);
		oper.vectFillUp(B);
		oper.vectFillUp(C);
		oper.vectFillUp(D);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Sleep of Thr2 was interrupted!");
		}

		D = oper.vectSub(oper.vectSort(oper.vectSum(A, B)), C);
		// вивід на консоль
		System.out.print("Task 1:\nD = ");
		oper.vectPrint(D);
		System.out.print("\n\n");

	}

}
