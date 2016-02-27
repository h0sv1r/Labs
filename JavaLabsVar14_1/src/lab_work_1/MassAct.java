package lab_work_1;

import java.util.ArrayList;

public interface MassAct {
	/**
	 * Сума двох матриць
	 */
	public int[][] massAdd(int[][] mass1, int[][] mass2);

	/**
	 * Сортування матриці по рядках
	 */
	public int[][] massSort(int[][] mass);

	/**
	 * Вивід масиву на стандартну консоль виводу
	 */
	public void massPrint(int[][] mass);

	/**
	 * Добуток матриці на вектор
	 */
	public ArrayList<Integer> massVectMul(int MC[][], ArrayList<Integer> D);

	/**
	 * Різниця матриць
	 */
	public int[][] massSub(int[][] mass1, int[][] mass2);
}
