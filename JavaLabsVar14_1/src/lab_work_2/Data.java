package lab_work_2;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Data {
	public static int a=0;
	public static ArrayList<Integer> B = new ArrayList<>();
	public static ArrayList<Integer> C = new ArrayList<>();

	public static int[][] MZ = new int[3][3];
	
	public static Semaphore semWait = new Semaphore(-1); //семафор для очікування введення всіх змінних
	public static Semaphore semInput = new Semaphore(1); // семафор для вводу змінних
	public static Semaphore semOutput = new Semaphore(0); // семафор для очікування виведення результату

	
	
}
