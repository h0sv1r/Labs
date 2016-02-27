package lab_work_2;

import java.util.ArrayList;

public interface VectorAct {
	/**
	 * Заповнює вектор випадковими значеннями від 1 до 3
	 */
	public void vectFillUp(ArrayList<Integer> list);

	/**
	 * Сума векторів
	 */
	public ArrayList<Integer> vectSum(ArrayList<Integer> a, ArrayList<Integer> b);

	/**
	 * Різниця векторів
	 */
	public ArrayList<Integer> vectSub(ArrayList<Integer> a, ArrayList<Integer> b);

	/**
	 * Сортування вектора
	 */
	public ArrayList<Integer> vectSort(ArrayList<Integer> a);

	/**
	 * Вивід вектора на стандартну консоль виводу
	 */
	public void vectPrint(ArrayList<Integer> vect);

	/**
	 * Зчитування значень вектора зі стандартної консолі вводу
	 */
	public ArrayList<Integer> vectInput();

	/**
	 * Множення векторів
	 */
	public ArrayList<Integer> vectMul(ArrayList<Integer> a, ArrayList<Integer> b);
}
