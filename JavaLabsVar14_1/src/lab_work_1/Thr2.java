package lab_work_1;


public class Thr2 implements Runnable {
	private int[][] MA = { { 2, -2, 2, 2, 8, 6, 11, 15, 15, 13 }, { 1, -4, 1, 1, 1, 3, 10, 7, 15, 10 },
			{ -1, -1, 4, 4, 4, 13, 6, 15, 14, 15 }, { 6, 3, -1, 6, 6, 1, 7, 2, 13, 11 },
			{ -3, -4, 2, -2, -1, 0, 6, 2, 5, 5 }, { 5, 0, 4, 9, 8, 3, 8, 12, 13, 12 },
			{ 7, 6, 7, 10, 11, 4, 8, 6, 8, 11 }, { 2, 4, 0, 2, -2, 6, 7, 10, 11, 15 },
			{ -5, 2, -1, 3, 9, 7, 11, 8, 12, 8 }, { 2, 3, 2, 1, 10, 3, 11, 9, 8, 10 } };
	private int[][] MB = { { -2, -4, 6, 2, 0, 9, 8, 9, 7, 9 }, { 1, 0, 8, 7, 4, 11, 9, 4, 11, 8 },
			{ -4, 4, 0, -3, -1, 9, 5, 12, 13, 14 }, { 4, 4, 2, 9, 8, 3, 9, 11, 9, 4 },
			{ -3, 3, 1, 6, 4, 12, 13, 8, 14, 12 }, { -4, 2, 4, 3, 5, 4, 8, 9, 5, 9 },
			{ 3, -2, 3, 0, 2, 4, 12, 11, 10, 12 }, { 0, -5, -4, -1, 6, 6, 3, 7, 10, 8 },
			{ 2, 2, 0, 6, 9, 4, 6, 12, 14, 11 }, { 4, -2, 1, 6, 0, 0, 10, 5, 6, 8 } };
	private int[][] MC = new int[10][10];
	
	@Override
	public void run() {
		System.out.println("Thread 2 started!");
		
		MassAct oper = new Operations();
		
		// MC = SORT(MA + MB)
		MC=oper.massSort(oper.massAdd(MA, MB));
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			System.out.println("Sleep of Thr2 was interrupted!");
		}
		
		System.out.println("Task 2:\nMC = ");
		oper.massPrint(MC);
		System.out.print("\n\n");
		
		
	}
	
}
