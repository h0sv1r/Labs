package lab_work_1;

import java.util.ArrayList;

public interface VectorAct {
	/**
	 * Заповнює вектор випадковими значеннями від 1 до 3
	 */
	public void vectFillUp(ArrayList<Integer> list);

	/**
	 * Сума векторів
	 */
	public ArrayList<Integer> vectSum(ArrayList<Integer> vect1, ArrayList<Integer> vect2);

	/**
	 * Різниця векторів
	 */
	public ArrayList<Integer> vectSub(ArrayList<Integer> vect1, ArrayList<Integer> vect2);

	/**
	 * Сортування вектора
	 */
	public ArrayList<Integer> vectSort(ArrayList<Integer> vect);

	/**
	 * Вивід вектора на стандартну консоль виводу
	 */
	public void vectPrint(ArrayList<Integer> vect);
}
